package com.kesavakowtharapu.employeemanagementsystem.repository;

import com.kesavakowtharapu.employeemanagementsystem.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findByEId(Integer eId);
}
