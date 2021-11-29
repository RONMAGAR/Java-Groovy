package package3

class Employee implements Comparable<Employee> {

      int id
      double salary
      String name

      static  int index = 0

      public static List employees

      def getElementFromList(){

      }

  def findAvailableObjectIndex(List list, emp_id ){
        def id = emp_id
        def temp = new Employee(id:emp_id)
        //println "Trying to find  emp with $emp_id"

        def index = 0
        def flag = false
        for(emp in list)
        {
              def res = employees.contains(temp)
              if(res){
                    index=  employees.indexOf(temp)
                   // println "Found emp with $index"
                    flag = true
                    break
              }

        }
        if(!flag)
        {
              println "NOT Found emp "
              index = -1

        }
          println "Final $index "
         index
   }

      def next()
      {

            index = index + 1
            def emp_id = this.id + 2
            def temp = new Employee(id:emp_id)

            //index = findAvailableObjectIndex(employees,emp_id)

           // println "Employee next $index"
            if(index > 6){
                  return null
                  index =0
            }

            else
            employees.get(index)
      }

      def previous()
      {

            index = index - 1

            def emp_id = this.id - 2
            def temp = new Employee(id:emp_id)
           // index = findAvailableObjectIndex(employees,emp_id)

           //  println "Employee previous $index"
            if(index < 0){
                  index = 0
                  return null
            }

            else
                  employees.get(index)

      }



      @Override
      int compareTo(Employee obj) {
          //  println "Employee compareTo"
            this.id.compareTo(obj.id)

      }
}
