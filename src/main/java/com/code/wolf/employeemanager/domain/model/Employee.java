package com.code.wolf.employeemanager.domain.model;

import lombok.Data;

@Data
public class Employee {
    private Long id;
    private String employeeCode;
    private String name;
    private String lastName;
    private String surName;
    private String secondSurname;
    private String documentType;
    private String document;
    private String jobTitle;
    private String email;
    private String phone;
    private String imageUrl;
}
