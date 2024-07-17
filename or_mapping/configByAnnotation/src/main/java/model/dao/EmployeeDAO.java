package model.dao;

import model.entity.Employee;

public class EmployeeDAO extends GenericDAO<Employee> {
    public EmployeeDAO() {
        super(Employee.class);
    }
}
