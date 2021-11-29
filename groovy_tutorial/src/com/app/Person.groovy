package com.app

class Person {
    int num
    String name
    Person(data,uname){
        num = data
        name = uname
    }
    void default_param(String myname,String course,int age =21){
        println "My name is "+ myname + " and currently pursuing " + course + ", my age is: " + age

    }
    void test_para(Map map){
        println "this is test_para() " + map.data + " other parameter passed is : " + map.uname
    }

}
