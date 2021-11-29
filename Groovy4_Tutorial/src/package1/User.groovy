package package1
//Define a groovy class User with properties as int uer_id, string uname and double salary.
//Define a testUser class to test calling of User constructor with named parameters and and
//postional parameters by passing array and using as operator with parametrized constructor and
//dislay the values of objects assigned with the constructors.
class User {
    int user_id
    String uname
    double salary

    User(user_id,uname,salary=20000){
        this.user_id = user_id
        this.uname = uname
        this.salary = salary
    }
    User(){
      println("default")
    }
//    User(Map map){
//        uname= map.name
//        this.salary= map.sal
//        this.user_id = map.id
//        //println(s)
//    }

}
