package myPack;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hi");

        System.out.println("sb1 : "+ sb1);
        System.out.println("sb1 : "+ sb2);

        sb1.append(sb2);
        System.out.println("append sb1 sb2 : " + sb1);

        sb1.delete(4,6);
        System.out.println("delete : " + sb1);

        sb1.insert(0,"ron");
        System.out.println("insert ron : " + sb1);



    }
}
