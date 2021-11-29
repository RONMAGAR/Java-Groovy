package com.data


println("this is a groovy script without ay class as class will " +
        "get created implicitly by the groovy compiler")

def obj = new User()
def result = obj.update()
def expected = "last_statement"
/*
if (result == expected)
    println("found a match")
else{ println("match not found")
    throw new Exception("the results are not matching!!!")
}
*/

assert result == expected//checks if the two values are equal are not
println("done with the assertion and values are equal")

def data = 1234


class User{//in order to make it groovy script it shouldnt be named after file name
    def name
    def update(){
        println("User Update! with $name")
        def rs = "last_statement"
    }
}