package Groovy_Closure_Usage

import com.sun.org.apache.xpath.internal.operations.Bool

import javax.swing.JPasswordField

class TestClosure {
    def name_class_level = "akshay"
    static void main(String[] args) {
        def Closure1 = {
            println("This is a closure!")

        }
        Closure1()
        Closure1.call()
        println(Closure1.class.name)
        println("-------------------------------")
        def name ="ronit"
        def Closure2 ={
            println("This is closure with $name")
            //println("This is a closure with $name_class_level") it accpets local variable present in the same scope
            // unless it is declared static
        }
        Closure2()
        println("-----------------------------")
        def Closure3 = {
            name_param->
                println("This is a closure with parameter : $name_param")
        }
        Closure3("nishant")
        Closure3.call("calling with call")
        println("------------------------------")
        def Closure4 = {
            name_param->
                println("This is a closure with parameter : $a")// No need to define parameters if parameter to be passed
                //is only one
        }
        Closure3("no parameter in closure")
        println("--------------------------------")
        def Closure5 = {
            name_param->
                println("This is a closure  : $name_param")// No need to define parameters if parameter to be passed
                //is only one
        }
        useClosure(Closure5)

        def closureReturned = returnClosure()
        closureReturned("parameter passed!")

        println("-------------------------------")
        def getSquare = {
            println("the square of $it is : ${it*it}")
        }

        getSquare(2)
        println("-------------------------------")
        def getSum ={num1,num2->
            println("The sum of $num1 and $num2 is : ${num1 +num2}")
        }
        getSum 12,13
        getSum "ron","it"
        println("--------------------------------")
        def numarray = [1,2,3,4,5,"akshay"]
        //ArrayList numarray = new ArrayList()
        //numarray = [1,2,3,"alskj;qwjd"]  --- in case of java
        numarray.add("javamaster")


        numarray.each {
            println("The number is : $it")}
        println("---------------------------------")
        def tobesorted = [1,2,3,true,"strrr",4.55]
//        tobesorted.each {
//
//            if (i instanceof Integer){
//                println("Integer present : " + i)
//            }
//            else if (i instanceof String){
//                println("String present : " + i)
//            }
//            else if (i instanceof Boolean){
//                println("boolean present : " + i)
//            }
//            else if (i instanceof Double){
//                println("Double present : "+ i)
//            }
//            else {
//                 println("weird data type")
//            }
//
//        }

    }
    static useClosure(Closure closure){
        closure("calling from method")
        closure.call("hiii")
    }
    static returnClosure(){
        def closure = {
            println("the closure is being returned from method with $it")
        }
        closure
    }
}
