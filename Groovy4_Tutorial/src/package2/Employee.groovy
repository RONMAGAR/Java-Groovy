package package2

import package1.Account

class Employee implements Comparable<Employee> {
    int id
    double salary
    String name
    private List<Employee> list

    static void main(String[] args) {
        def Start = new Employee(id: 101,salary: 20000,name: "spiderman")
        def mid = new Employee(id : 105,salary:2345,name: "hulk")
        def End = new Employee(id:110,salary: 30000,name: "ironman")
        ArrayList<Employee> obj_arr = new ArrayList<>()



       def emprange = Start..End
       println(emprange)
        def closure1 = {
            emp->
                Employee temp = emp
                println("Details of the Employee are - id : $temp.id , name : $temp.name ")
        }

        emprange.each {
            println("Details are- name: ${it.name} id: ${it.id} " )
        }


    }

    int compareTo(Employee e){
        println("1")
        if (this.id < e.id){
            return -1
        }
        else if(this.id>e.id){
            return 1
        }
        return 0
    }

    def next(){

       Employee e = new Employee(salary: 123123,name: "asldnlsfnd")
        e.id = this.id + 1
        e.name = e.name + " id : " + e.id
        e.salary = e.salary + (e.id+10)
        return e
    }


}
