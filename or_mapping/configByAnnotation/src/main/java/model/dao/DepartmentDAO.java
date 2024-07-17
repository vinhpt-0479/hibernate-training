package model.dao;

import model.entity.Department;

public class DepartmentDAO extends GenericDAO<Department> {
    public DepartmentDAO() {
        super(Department.class);
    }
}
