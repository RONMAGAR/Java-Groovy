package package1

class person{
    private String name
    private Integer salary

//    Integer getSalary(){
//        println "getSalary with conditions"
//        salary // here salary should be in last line
//        name
//        salary
//    }
//    person(Integer data,String name){
//        salary = data
//        this.name = name
//    }

}
class VerifyDirectAccess {
    static void main(String[] args) {
        def obj = new person(salary:200000,name:"akshay")
        println("The salary is : $obj.salary")
        println("Name is : $obj.name" )
        println(obj.name + obj.salary)
        def Name = obj.name
        println(Name)
    }
}
