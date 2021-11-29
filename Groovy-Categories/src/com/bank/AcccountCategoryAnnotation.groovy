package com.bank
@Category(Account)
class AcccountCategoryAnnotation {
    public plus(Integer param){
        println("AccountCaegory plus")
        def balanceData = this.balance + param
        def newAccount = new Account(balance: balanceData)
    }
    public minus( Integer param){
        println("AccountCaegory minus")
        def balanceData = this.balance - param
        def newAccount = new Account(balance: balanceData)
    }
    public multiply(Integer param){
        println("AccountCaegory multiply")
        def balanceData = (this.balance*param)/100 + this.balance
        def newAccount = new Account(balance: balanceData)
    }
}
