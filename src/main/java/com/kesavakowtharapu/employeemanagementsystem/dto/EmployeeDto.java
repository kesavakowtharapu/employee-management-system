package com.kesavakowtharapu.employeemanagementsystem.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDto {

    private int eId;
    private String name;
    private String gender;
    private Date dob;
    private String address;
    private String phone;
    private String email;
}
