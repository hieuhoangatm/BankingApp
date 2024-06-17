package com.dinhhieu.BankingApllication.service;

import com.dinhhieu.BankingApllication.entity.Account;

import java.util.List;

public interface AccountService {
    public Account createAccount(Account account);
    public Account getAccountDetailsByAccountNumber(Long accountNumber);

    List<Account> getAllAccountDetails();

    public Account depositAmount(Long accountNumber,Double amount);

    public Account withdrawAmount(Long accountNumber,Double amount);

    public void closeAccount(Long accountNumber);
}
