package app.Test

class TestGroovyClass {

    static void main(String[] args) {
        GroovyClass obj = new GroovyClass(); // JAVA METHOD FOR OBJECT CREATION
        def obj1 = new GroovyClass()         // GROOVY METHOD FOR OBJECT CREATION
        obj.test(123)
        obj1.test("hello universe!!")
        println(obj1.userData)
        println(obj.userData)


    }


}
