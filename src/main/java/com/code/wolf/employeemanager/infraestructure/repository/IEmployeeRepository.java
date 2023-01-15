package com.code.wolf.employeemanager.infraestructure.repository;

import com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    EmployeeEntity findByEmployeeCode(String employeeCode);



}
