package model.dao;

import model.entity.Course;

public class CourseDAO extends GenericDAO<Course> {
    public CourseDAO() {
        super(Course.class);
    }
}
