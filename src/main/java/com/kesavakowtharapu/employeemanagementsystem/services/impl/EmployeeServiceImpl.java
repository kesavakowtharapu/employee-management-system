package com.kesavakowtharapu.employeemanagementsystem.services.impl;

import com.kesavakowtharapu.employeemanagementsystem.domain.Employee;
import com.kesavakowtharapu.employeemanagementsystem.dto.EmployeeDto;
import com.kesavakowtharapu.employeemanagementsystem.mapper.EmployeeMapper;
import com.kesavakowtharapu.employeemanagementsystem.repository.EmployeeRepository;
import com.kesavakowtharapu.employeemanagementsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.toModel(employeeDto);
        return employeeRepository.insert(employee);
    }

    @Override
    public Employee findEmployee(Integer eId) {
        return null;
    }
}
