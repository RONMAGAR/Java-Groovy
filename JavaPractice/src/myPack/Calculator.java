package myPack;

public class Calculator {
    void add(int a, int b){
        System.out.println("Result : " + a+b);
    }

    void add(int a,int b,int c){
        System.out.println("Result : " + a+b+c);
    }

    void add(int a,float b){
        System.out.println("Result : " + (a+b));
    }
    void add(float a,float b){
        System.out.println("Result : " + (a+b));
    }
    void add(float a,int b){
        System.out.println("Result : " + (a+b));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(2,3);
        c.add(2.3f,4.5f);
        c.add(2,6.7f);
        c.add(1.9f,100);
    }
}
