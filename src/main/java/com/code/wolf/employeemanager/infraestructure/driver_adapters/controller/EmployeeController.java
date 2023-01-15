package com.code.wolf.employeemanager.infraestructure.driver_adapters.controller;

import com.code.wolf.employeemanager.domain.model.Employee;
import com.code.wolf.employeemanager.domain.use_case.EmployeeUseCase;
import com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("employee")
public class EmployeeController {

    private final EmployeeUseCase employeeUseCase;


    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeUseCase.saveEmployee(employee), HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeUseCase.update(employee), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
        return new ResponseEntity<>(employeeUseCase.getEmployee(id),HttpStatus.OK);
    }

    @GetMapping("list")
    public ResponseEntity<List<EmployeeEntity>> getList(){
        return new ResponseEntity<>(employeeUseCase.listEmployee(),HttpStatus.OK);
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable Long id){
        return new ResponseEntity<>(employeeUseCase.deleteEmployee(id),HttpStatus.OK);
    }


}
