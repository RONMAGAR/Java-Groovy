
package data

class Employee {
    def num
    def name
    def salary

    Employee(data, uname, amount){
        System.out.println("Employee (Params)")
        num = data
        name = uname
        salary = amount
    }

    /*Employee(data, uname='defaultName', amount=5000.66){
        System.out.println("Employee (Params default)")
        num = data
        name = uname
        salary = amount
    }*/



    Employee() {
        System.out.println("Employee default()")
    }

    /*Employee(Map map) {
        System.out.println("Employee (Map)")
        num = map.num
        name = map.name
        salary = map.salary
    }*/
}
