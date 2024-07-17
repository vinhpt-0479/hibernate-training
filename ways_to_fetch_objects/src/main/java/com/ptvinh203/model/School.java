package com.ptvinh203.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class School {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String address;
    private String email;
    private String phone;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
    private List<Class> classes;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
    private List<Student> students;

    public School() {
    }

    public School(UUID id, String name, String address, String email, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
