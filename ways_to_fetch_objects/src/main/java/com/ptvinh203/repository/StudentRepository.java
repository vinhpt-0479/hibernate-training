package com.ptvinh203.repository;

import com.ptvinh203.dto.StudentDTO;
import com.ptvinh203.model.Student;
import com.ptvinh203.util.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;

import java.util.List;
import java.util.UUID;

public class StudentRepository implements CRUDRepository<Student, UUID> {

    public List<Student> selectAllWithPaging() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Student> query = builder.createQuery(Student.class);
            Root<Student> root = query.from(Student.class); // FROM
            query.select(root); // SELECT
            query.where(builder.and(builder.ge(root.get("age"), 21), builder.le(root.get("age"), 40))); // WHERE age >= 21 AND age <= 40
            query.orderBy(builder.asc(root.get("name"))); // ORDER BY name ASC
            return session.createQuery(query)
                .setFirstResult(0)
                .setMaxResults(5)
                .getResultList();
        }
    }

    public List<UUID> selectAllId() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            NativeQuery<UUID> query = session.createNativeQuery("select id from student");
            query.addScalar("id", UUID.class);
            return query.list();
        }
    }

    public List<StudentDTO> selectAllDto() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            NativeQuery query = session.createNativeQuery("select id, name, address from student");
            List<StudentDTO> students = query.setResultTransformer(Transformers.aliasToBean(StudentDTO.class)).list();
            return students;
        }
    }

    public List<Student> selectAllWithNativeQuery() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Student> students = session.createNativeQuery(
                    "SELECT * FROM student s " +
                        "JOIN  school sc ON s.school_id = sc.id", Student.class)
                .list();
            return students;
        }
    }

    @Override
    public List<Student> selectAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Student> query = session.createQuery("from Student", Student.class);
            return query.list();
        }
    }

    @Override
    public Student selectById(UUID uuid) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Student> query = session.createQuery("from Student s where s.id=:student_id", Student.class);
            query.setParameter("student_id", uuid.toString());
            return query.list().stream().findFirst().orElse(null);
        }
    }

    @Override
    public boolean save(Student data) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(data);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Student update(UUID uuid, Student data) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }
}
