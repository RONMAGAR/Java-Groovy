package myPack;

public class StringDemo {

    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("Hi");
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("result of compareTo : " + s2.compareTo(s1));
        System.out.println("char at 2nd index in s1 " + s1.charAt(2));
        String s3  = new String("Hello");
        System.out.println("result of s3 compareto s1 " + s3.compareTo(s1));
        s2.concat("welcome");
        System.out.println("s2 after concat : " + s2);
        s2 = s2.concat("welcome");
        System.out.println("s2 after concat : " + s2);

        System.out.println("s1 equals s3 : " + s1.equals(s3));
        System.out.println("s1 equalsIgnoreCase s3 : " + s1.equalsIgnoreCase(s3));

        String s4 = new String("Hello");
        System.out.println("s1 equals s4 : " + s1.equals(s4));

        String s5 = "Hello";
        System.out.println("s1==s5" + s1 == s5);// "==" checks if objects are pointing to the same reference
        System.out.println();

    }
}
