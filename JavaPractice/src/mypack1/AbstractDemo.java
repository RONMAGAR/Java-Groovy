package mypack1;

public abstract class AbstractDemo {
    void display(){
        System.out.println("display in demo!!!");
    }
    abstract void show(String msg);

    public static void main(String[] args) {
        AbstractDemo obj = new AbstractDemoChild();//AbstractDemo class is abstract and cant be initialized or we cant create object of it!!!
        obj.display();
        obj.show("hello");
        ((AbstractDemoChild)obj).print();//cannot be accessed directly
    }

}
