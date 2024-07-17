package model.entity;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private int id;
    private String name;
    private Set<Employee> employees = new HashSet<>();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
    public Department(String name, Set<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
    public Department() {
    }
    
}