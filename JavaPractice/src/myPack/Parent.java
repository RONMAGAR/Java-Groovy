package myPack;

public class Parent {

    private String msg;

    public Parent()
    {
        super();
        System.out.println("Parent Constructor ");
    }
    public Parent(String msg)
    {
        this.msg = msg;
        System.out.println("Parent Parameterized Constructor!!! " + msg);
    }

}
