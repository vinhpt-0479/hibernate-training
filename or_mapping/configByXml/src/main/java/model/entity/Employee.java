package model.entity;

public class Employee {
    private int id;
    private String name;
    private Department department;
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
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    public Employee() {
    }

    
}
