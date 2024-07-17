package com.ptvinh203.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Class {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "aClass")
    private List<Student> students;

    public Class() {
    }

    public Class(UUID id, String name, School school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
