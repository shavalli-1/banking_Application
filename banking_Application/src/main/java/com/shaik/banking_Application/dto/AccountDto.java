package com.shaik.banking_Application.dto;


public class AccountDto {

    public AccountDto(Long id, String account_holder_name, double balance) {
        this.id = id;
        this.account_holder_name = account_holder_name;
        this.balance = balance;
    }

    public AccountDto() {
    }

    private Long id;
    private String account_holder_name;
    private double balance;

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
