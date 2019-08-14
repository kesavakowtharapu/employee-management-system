package com.kesavakowtharapu.employeemanagementsystem.services.impl;

import com.kesavakowtharapu.employeemanagementsystem.domain.Employee;
import com.kesavakowtharapu.employeemanagementsystem.dto.EmployeeDto;
import com.kesavakowtharapu.employeemanagementsystem.mapper.EmployeeMapper;
import com.kesavakowtharapu.employeemanagementsystem.repository.EmployeeRepository;
import com.kesavakowtharapu.employeemanagementsystem.services.EmployeeService;
import com.kesavakowtharapu.employeemanagementsystem.util.EmployeeSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.toModel(employeeDto);
        autoGenerateEid(employee);
        return employeeRepository.insert(employee);
    }

    @Override
    public Employee findEmployee(Integer eId) {
        return employeeRepository.findByEId(eId);
    }

    private Employee autoGenerateEid(Employee employee){
        List<Employee> employeeList = employeeRepository.findAll();
        Collections.sort(employeeList,new EmployeeSort());
        if(employeeList == null || employeeList.isEmpty()){
            employee.setEId(1000);
        } else {
            int index = employeeList.size()-1;
            Employee lastRecord = employeeList.get(index);
            employee.setEId(lastRecord.getEId() + 1);
        }
        return employee;
    }
}
