package com.app.Person

import app.Test.GroovyClass
import com.app.Person

class TestPerson {
    static void main(String[] args) {
        def person = new Person(123,'ron')
        def person2 = [234,'tony'] as Person        // Creating objects
        Person person3 = [345,'df']
        def groovycalass = new GroovyClass()
        println(person.name)
        println(person.num)

        println(person2.name)
        println(person2.num)

        println(person3.name)
        println(person3.num)

        person.default_param('Ronit Magar','Computer Science ')
        person.test_para(uname: "2nd argument",data: 1234)

    }
}
