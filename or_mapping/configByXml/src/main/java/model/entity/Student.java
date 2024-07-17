package model.entity;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private Set<Course> courses = new HashSet<>();
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
    public Set<Course> getCourses() {
        return courses;
    }
    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
    public Student(String name, Set<Course> courses) {
        this.name = name;
        this.courses = courses;
    }
    public Student() {
    }
    
}