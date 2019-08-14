package com.kesavakowtharapu.employeemanagementsystem.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "Employee")
public class Employee {

    private int eId;
    private String name;
    private String gender;
    private Date dob;
    private String address;
    private String phone;
    private String email;
}
