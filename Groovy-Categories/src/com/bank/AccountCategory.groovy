package com.bank

class AccountCategory {
    public static plus(Account target, Integer param){
        println("AccountCaegory plus")
        def balanceData = target.balance + param
        def newAccount = new Account(balance: balanceData)
    }
    public static minus(Account target, Integer param){
        println("AccountCaegory minus")
        def balanceData = target.balance - param
        def newAccount = new Account(balance: balanceData)
    }
    public static multiply(Account target, Integer param){
        println("AccountCaegory multiply")
        def balanceData = (target.balance*param)/100 + target.balance
        def newAccount = new Account(balance: balanceData)
    }
}