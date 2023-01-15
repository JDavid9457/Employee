package com.code.wolf.employeemanager.domain.use_case;

import com.code.wolf.employeemanager.domain.model.Employee;
import com.code.wolf.employeemanager.domain.service.EmployeeGateway;
import com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;


import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class EmployeeUseCase {

    private final EmployeeGateway employeeGateway;

    public Employee saveEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeGateway.saveEmployee(employee);
    }

    public Employee update(Employee employee) {
        return employeeGateway.updateEmployee(employee);
    }

    public Employee getEmployee(Long idEmploye){
        return employeeGateway.getEmployee(idEmploye);
    }

    public List<EmployeeEntity> listEmployee(){
        return employeeGateway.listEmployee();
    }

    public Boolean deleteEmployee(Long id){
        return  employeeGateway.delete(id);
    }

}
