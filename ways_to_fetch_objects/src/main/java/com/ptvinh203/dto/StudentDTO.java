package com.ptvinh203.dto;

import java.util.UUID;

public class StudentDTO {
    private UUID id;
    private String name;
    private String address;

    public StudentDTO() {
    }

    public StudentDTO(UUID id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

}
