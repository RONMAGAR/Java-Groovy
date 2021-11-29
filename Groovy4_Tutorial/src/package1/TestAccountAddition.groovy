package package1

class TestAccountAddition {
    static void main(String[] args) {
        Account obj1 = new Account(id: 101,name: "akshay",balance:100000)
        Account obj2 = new Account(id :102,name: "nishant",balance: 200000)
        Account obj3 = new Account(id:103,name: "ronit",balance: 3000000)

        def obj4 = obj3 + obj2
        println(obj4.balance)

//        def objRange = obj1..obj3
//        objRange.each {println(it.id)}

    }
}
