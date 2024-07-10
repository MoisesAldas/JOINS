package com.example.joins.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
 @Table (name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

}
