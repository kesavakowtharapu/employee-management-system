package com.kesavakowtharapu.employeemanagementsystem.services;

import com.kesavakowtharapu.employeemanagementsystem.domain.Employee;
import com.kesavakowtharapu.employeemanagementsystem.dto.EmployeeDto;

public interface EmployeeService {

    Employee createEmployee(EmployeeDto employeeDto);
    Employee findEmployee(Integer eId);
}
