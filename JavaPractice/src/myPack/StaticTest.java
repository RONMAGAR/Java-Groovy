package myPack;

public class StaticTest {
    int number;
    static int count;
    static {
        System.out.println("static block");
        count = 100;
    }

    {   System.out.println("init block !!");
        number  = 10;
    }

    public StaticTest(){
        System.out.println("Default constructor!!!");

    }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println("count : " + count);
        StaticTest obj = new StaticTest();


        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.compareTo(s2));

    }
}

