package com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Data
@Table(name ="employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    @Column(nullable = false, updatable = false)
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
