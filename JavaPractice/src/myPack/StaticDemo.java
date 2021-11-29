package myPack;

public class StaticDemo {
    int number;
    static int count;
    public void show(){
        System.out.println("Inside show");
        System.out.println("count : " + count);
        System.out.println("number: " + number);

    }
    public static void display(){
        System.out.println("Inside display");
        System.out.println("count : " + count);
        //System.out.println("number: " + number); Nonstatic number cant be accessed in static

    }

    public static void main(String[] a){
        count = 1000;
        System.out.println("count : " + count);//here static variable can be accessed without creating an object
        StaticDemo obj = new StaticDemo();
        obj.number = 100;
        System.out.println(obj.number);
        display(); // can be called directly as it is static
         StaticDemo sho = new StaticDemo();
         sho.show(); // non-static so access with object


        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        obj1.count = 1;
        obj2.count = 2;     //obj created will refer to single copy when variable is static,static variables will be on stack
        System.out.println(obj1.count + " " + obj2.count);


    }
}
