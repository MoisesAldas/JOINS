package com.example.joins.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String password;

    @OneToOne
    @JoinColumn(name = "id")
    private Employee employee;
}
