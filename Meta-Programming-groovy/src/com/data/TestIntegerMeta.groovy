package com.data

/*
class TestIntegerMeta {

}
*/

def num = 123
def num2 = 2
Integer.metaClass.getTenTimeValue = {->
    delegate.intValue()*10
}
num.metaClass.calculateSquareValue={
    num*num
}
def res = 22.getTenTimeValue()
println(res)


num.metaClass.calcube = {
    num*num*num
}
//def square = num.calculateSquareValue()

//def square2 = num2.calculateSquareValue()  It doesn't add feature to the integer class,
// it only provides its  functionality at run time and only for that specific variable
//println("Square of num2 is $square2")
//println("Square Value of $num is $square")


//def reult10 = num.getTenTimeValue()
def rs = num.getTenTimeValue()
println(rs)
def result = num.calcube()
println(result)

def result2 = num.calculateSquareValue()
println(result2)
//def result = num.calculateSquareValue()
//println(reult10)
//println(result)