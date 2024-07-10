package com.example.joins.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@Data
@Entity
@Table(name = "tbl_account")
public class Account {
    @Id
    private  int  id;
    private String password;

    @OneToOne
    @JoinColumn(name ="id", referencedColumnName = "id")
    private Employee employee;
}
