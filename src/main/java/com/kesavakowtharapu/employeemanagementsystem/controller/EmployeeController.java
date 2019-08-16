package com.kesavakowtharapu.employeemanagementsystem.controller;

import com.kesavakowtharapu.employeemanagementsystem.dto.EmployeeDto;
import com.kesavakowtharapu.employeemanagementsystem.mapper.EmployeeMapper;
import com.kesavakowtharapu.employeemanagementsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/employee")
@CrossOrigin(maxAge = 1000)
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping(value="/create" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createEmployee(@RequestBody EmployeeDto employeeDto){

        return new ResponseEntity(employeeMapper.toDto(employeeService.createEmployee(employeeDto)), HttpStatus.OK);
    }

    @RequestMapping(value="/search/{eId}" , method = RequestMethod.GET)
    public ResponseEntity searchEmployee(@PathVariable(value = "eId") Integer eId){
        EmployeeDto employeeDto  = employeeMapper.toDto(employeeService.findEmployee(eId));
        if(employeeDto == null){
            return new ResponseEntity("{\"Status\":\"Record not found!\"}", HttpStatus.OK);
        } else {
            return new ResponseEntity(employeeDto, HttpStatus.OK);
        }
    }
}
