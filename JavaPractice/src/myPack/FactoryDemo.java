package myPack;

public class FactoryDemo {
    private FactoryDemo(){

    }
    // It will return the object of the class whose constructor is private from outside the class
    public static FactoryDemo getObject(){
        return new FactoryDemo();
    }
}
