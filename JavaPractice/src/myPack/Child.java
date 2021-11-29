package myPack;

public class Child extends Parent{
    private int number;
    public Child(){
        super("hellosss"); // it will call constructor of parent class that is parameterized as we pass the parameter
        System.out.println("Child Default Constructor !!!");
    }
    public Child(String s)
    {
        this(10);// it will go to Child constructor of same class with number as a parameter
        System.out.println("This cild constructor check");
    }
    public Child(int number)
    {
        super("hii");
        this.number = number;
        System.out.println("child parameterized constructor : " + number);
    }

    public static void main(String[] args)
    {

        Child obj = new Child();
    }
}
