package com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity.helper;

import com.code.wolf.employeemanager.domain.model.Employee;
import com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity.EmployeeEntity;

public class Converter {

  public EmployeeEntity toEntity(Employee employee){
      EmployeeEntity employeeEntity = new EmployeeEntity();
      employeeEntity.setEmployeeCode(employee.getEmployeeCode());
      employeeEntity.setName(employee.getName());
      employeeEntity.setLastName(employee.getLastName());
      employeeEntity.setSurName(employee.getSurName());
      employeeEntity.setSecondSurname(employee.getSecondSurname());
      employeeEntity.setDocumentType(employee.getDocumentType());
      employeeEntity.setDocument(employee.getDocument());
      employeeEntity.setJobTitle(employee.getJobTitle());
      employeeEntity.setEmail(employee.getEmail());
      employeeEntity.setPhone(employee.getPhone());
      employeeEntity.setImageUrl(employee.getImageUrl());
      return employeeEntity;
  }

  public Employee toModel(EmployeeEntity employee){
      Employee employeeModel = new Employee();
      employeeModel.setId(employee.getId());
      employeeModel.setEmployeeCode(employee.getEmployeeCode());
      employeeModel.setName(employee.getName());
      employeeModel.setLastName(employee.getLastName());
      employeeModel.setSurName(employee.getSurName());
      employeeModel.setSecondSurname(employee.getSecondSurname());
      employeeModel.setDocumentType(employee.getDocumentType());
      employeeModel.setDocument(employee.getDocument());
      employeeModel.setJobTitle(employee.getJobTitle());
      employeeModel.setEmail(employee.getEmail());
      employeeModel.setPhone(employee.getPhone());
      employeeModel.setImageUrl(employee.getImageUrl());
      return employeeModel;
  }
}
