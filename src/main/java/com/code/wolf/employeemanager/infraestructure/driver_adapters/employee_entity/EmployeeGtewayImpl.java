package com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity;

import com.code.wolf.employeemanager.domain.model.Employee;
import com.code.wolf.employeemanager.domain.service.EmployeeGateway;
import com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity.helper.Converter;
import com.code.wolf.employeemanager.infraestructure.repository.IEmployeeRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Boolean.TRUE;

@RequiredArgsConstructor
@Service
public class EmployeeGtewayImpl implements EmployeeGateway {

    private final Converter converter;

    private final IEmployeeRepository iEmployeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        EmployeeEntity employeeEntity = iEmployeeRepository.save(converter.toEntity(employee));
        return employeeEntity != null ? converter.toModel(employeeEntity) : null;
    }

    @Override
    public Employee updateEmployee(Employee updateEmployee) {
        EmployeeEntity employeeEntity = iEmployeeRepository.save(converter.toEntity(updateEmployee));
        return employeeEntity != null ? converter.toModel(employeeEntity) : null;
    }

    @Override
    public List<EmployeeEntity> listEmployee() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public Boolean delete(Long id) {
        iEmployeeRepository.deleteById(id);
        return TRUE;
    }


    @Override
    public Employee getEmployee(Long idEmployee) {
        EmployeeEntity employeeEntity = iEmployeeRepository.findById(idEmployee).orElse(null);
        return employeeEntity != null ? converter.toModel(employeeEntity) :null;
    }


    @Override
    public Employee findByEmployeeCode(String employeeCode) {
        EmployeeEntity employeeEntity = iEmployeeRepository.findByEmployeeCode(employeeCode);
        return employeeEntity != null ? converter.toModel(employeeEntity): null;
    }

}
