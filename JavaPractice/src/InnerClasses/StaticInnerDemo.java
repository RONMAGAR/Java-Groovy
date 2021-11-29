package InnerClasses;

public class StaticInnerDemo {
    private int number;
    private static String msg;

    void show(){
        System.out.println("Number : "+number);
        System.out.println("Msg : "+ msg);
    }

    static void display(){
        System.out.println("msg"+ msg);
    }
    static class  Inner{
        void myMethod(){
            //number = 100;  as number is not static
           msg = "Hello";
           display();
        }
    }

    public static void main(String[] args) {
        StaticInnerDemo obj = new StaticInnerDemo();
        StaticInnerDemo.display();

        StaticInnerDemo.Inner obj1 = new StaticInnerDemo.Inner();
        obj1.myMethod();
    }
}
