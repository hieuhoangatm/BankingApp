package com.dinhhieu.BankingApllication.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_number;
    @Column
    private String account_holder_name;
    @Column
    private Double account_balance;

    public Account(){

    }
    public Account(Long account_number, String account_holder_name, Double account_balance) {
        this.account_number = account_number;
        this.account_holder_name = account_holder_name;
        this.account_balance = account_balance;
    }

    public Long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(Long account_number) {
        this.account_number = account_number;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public Double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(Double account_balance) {
        this.account_balance = account_balance;
    }
}
