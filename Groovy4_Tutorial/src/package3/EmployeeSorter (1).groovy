package package3

class EmployeeSorter {

    private static  List<Employee> list


    static void main(String []args){

        list = new ArrayList<Employee>()
        list.add(new Employee(id:10, name:'startWork',salary:1000))
        list.add(new Employee(id:24, name:'endOfWorh',salary:6700))
        list.add(new Employee(id:14,name:'Greg',salary:5670))
        list.add(new Employee(id:16,name:'Sylester',salary:1700))
        list.add(new Employee(id:12, name:'maya',salary:4500))
        list.add(new Employee(id:22,name:'Dinesh',salary:1900))
        list.add(new Employee(id:4,name:'Dinesh',salary:1900))

        list.sort()

        Employee.employees = list
        Employee.index= 0

        println "List of Employees sorted by id"

        list.each {
            println "Employeeyee with id =$it.id"
        }

        def start =list.first()
        def end = list.last()

        def employeeRange = start..end

        //println employeeRange.size()

        Employee.index= 0
        println "*********"

        def closureEmp = {emp->
            Employee temp = emp
            println "THe employee details are $temp.id and" +
                    " $temp.name and" +
                    "$temp.salary"
        }

        employeeRange.each(closureEmp)


    }

    /*@Override
    int compareTo(Object other) {
          Employee temp = other

          return 0
    }*/
}
