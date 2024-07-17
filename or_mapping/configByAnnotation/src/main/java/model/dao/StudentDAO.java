package model.dao;

import model.entity.Student;

public class StudentDAO extends GenericDAO<Student> {
    public StudentDAO() {
        super(Student.class);
    }
}
