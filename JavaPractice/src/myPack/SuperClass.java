package myPack;

public class SuperClass {
    void display(){
        System.out.println("display() from superclass");

    }
    public SuperClass getObject(){

        return new SuperClass();
    }
    void print(){
        System.out.println("print() in Superclass");
    }
}
