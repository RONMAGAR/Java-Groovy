package package1

class Account {
    Integer id
    double balance
    String name

    def plus(obj){
        println("account plus ,this is balance of obj2 bcoz it comes 2nd in + operation : " + obj.balance)
        Account second = obj
        def objsum = new Account()
        objsum.balance = this.balance + second.balance
        objsum
    }

}
