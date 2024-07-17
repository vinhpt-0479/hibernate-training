package model.entity;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private int id;
    private String name;
    private Set<Student> students = new HashSet<>();
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
    public Set<Student> getStudents() {
        return students;
    }
    public void setStudents(Set<Student> students) {
        this.students = students;
    }
    public Course(String name, Set<Student> students) {
        this.name = name;
        this.students = students;
    }
    public Course() {
    }
}