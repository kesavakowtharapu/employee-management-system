package com.kesavakowtharapu.employeemanagementsystem.controller;

import com.kesavakowtharapu.employeemanagementsystem.dto.EmployeeDto;
import com.kesavakowtharapu.employeemanagementsystem.mapper.EmployeeMapper;
import com.kesavakowtharapu.employeemanagementsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping(value="/create" , method = RequestMethod.POST)
    public ResponseEntity createEmployee(@RequestBody EmployeeDto employeeDto){

        return new ResponseEntity(employeeMapper.toDto(employeeService.createEmployee(employeeDto)), HttpStatus.OK);
    }
}
