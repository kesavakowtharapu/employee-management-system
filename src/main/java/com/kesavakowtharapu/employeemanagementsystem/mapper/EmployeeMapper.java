package com.kesavakowtharapu.employeemanagementsystem.mapper;

import com.kesavakowtharapu.employeemanagementsystem.domain.Employee;
import com.kesavakowtharapu.employeemanagementsystem.dto.EmployeeDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDto toDto(Employee employee);
    Employee toModel(EmployeeDto employeeDto);
}
