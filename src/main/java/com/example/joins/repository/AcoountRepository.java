package com.example.joins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.joins.model.Account;

@Repository
public interface AcoountRepository extends JpaRepository<Account, Integer>{
}
