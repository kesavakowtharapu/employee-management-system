package com.kesavakowtharapu.employeemanagementsystem.util;

import com.kesavakowtharapu.employeemanagementsystem.domain.Employee;

import java.util.Comparator;

public class EmployeeSort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEId()-o2.getEId();
    }
}
