package com.code.wolf.employeemanager.application;

import com.code.wolf.employeemanager.domain.service.EmployeeGateway;
import com.code.wolf.employeemanager.domain.use_case.EmployeeUseCase;
import com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity.EmployeeGtewayImpl;
import com.code.wolf.employeemanager.infraestructure.driver_adapters.employee_entity.helper.Converter;
import com.code.wolf.employeemanager.infraestructure.repository.IEmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class UseCaseConfig {
    private final IEmployeeRepository iEmployeeRepository;


    @Bean
    public Converter converter() {
        return new Converter();
    }

    @Bean
    public EmployeeGateway employeeGatewayGateway() {
        return new EmployeeGtewayImpl(converter(), iEmployeeRepository);
    }

    @Bean
    public EmployeeUseCase createEmployeeUseCase(EmployeeGateway employeeGatewayGateway) {
        return new EmployeeUseCase(employeeGatewayGateway);
    }

}
