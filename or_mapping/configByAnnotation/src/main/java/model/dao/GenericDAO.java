package model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import config.HibernateConfig;

import java.util.List;

public abstract class GenericDAO<T> {
    private Class<T> entityClass;
    private SessionFactory sessionFactory;

    public GenericDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
        this.sessionFactory = HibernateConfig.getFactory();
    }

    public void save(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(entity);
            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void update(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(entity);
            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void delete(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(entity);
            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public T find(int id) {
        Session session = sessionFactory.openSession();
        try {
            return session.get(entityClass, id);
        } finally {
            session.close();
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        Session session = sessionFactory.openSession();
        try {
            return session.createQuery("from " + entityClass.getName()).list();
        } finally {
            session.close();
        }
    }
}
