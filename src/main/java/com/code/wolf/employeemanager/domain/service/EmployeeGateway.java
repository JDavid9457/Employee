package com.code.wolf.employeemanager.domain.service;

import com.code.wolf.employeemanager.domain.model.Employee;
import com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity.EmployeeEntity;

import java.util.List;

public interface EmployeeGateway {

    Employee saveEmployee(Employee employee);

    Employee getEmployee(Long idEmployee);

    Employee findByEmployeeCode(String employeeId);

    Employee updateEmployee(Employee employee);

    List<EmployeeEntity> listEmployee();

    Boolean delete(Long id);
}
