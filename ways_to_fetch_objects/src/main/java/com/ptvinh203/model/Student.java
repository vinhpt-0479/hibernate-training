package com.ptvinh203.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private int age;
    private String address;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class aClass;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    public Student() {}

    public Student(UUID id, String name, int age, String address, Class aClass, School school) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.aClass = aClass;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
