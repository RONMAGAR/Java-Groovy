package data

class TestConstructor {

    static void main(String []args){
        Employee emp1 = new Employee(23,'naan',1000.00)//java
        def emp2 = new Employee(44,'baab', 1200.88)

        // def emp21 = new Employee( 'baab', 1200.88,33)
        def emp3 = [101,'mohan', 2000.77] as Employee
        Employee emp4 = [202, 'Bana', 3477.97]
        def emp5
        emp5 = new Employee('salary': 3456.77,'name': 'bhargav')

        def emp6 = new Employee(num: 1234)

        def emp7
        emp7 = new Employee('salary': 467.78,'name': 'ashok')

        println emp1.name
        println emp2.name
        println emp3.name
        println emp4.name
        println emp5.name
        println emp6.name
        println emp7.name







    }
}
