package com.dinhhieu.BankingApllication.repository;

import com.dinhhieu.BankingApllication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
