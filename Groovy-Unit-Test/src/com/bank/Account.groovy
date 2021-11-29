package com.bank
class Account {

    private Integer balance

    public Integer getBalance(){
        balance
    }
    Account(){
        balance = 0
    }
    public void deposit(Integer amount){
        balance += amount
    }
    public Integer withdraw(Integer amount){
        if (amount  > balance){
            throw new Exception("Insufficient balance")
        }
        else {
            balance -= amount
        }
    }
}
