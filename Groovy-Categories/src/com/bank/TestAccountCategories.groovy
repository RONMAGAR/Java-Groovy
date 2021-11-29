package com.bank

    def obj1 = new Account(balance: 3456)
    def obj2 = new Account(balance: 1234)
//    def obj3 = obj1 + obj2
    use(AcccountCategoryAnnotation){
        def obj4 = obj1 + 4500
        println("account int added $obj4.balance")

    def obj5 = obj1-23
    println("account int subtracted $obj5.balance")

        def income = obj1*10
        println("account income at 10% interest rate is $income.balance")
        //println(obj1.balance)

}




