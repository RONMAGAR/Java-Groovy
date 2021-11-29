package myPack;

import java.util.Locale;

public class StringProb {
    public static void main(String[] args) {
        System.out.println("Original : "+args[0]);
     System.out.println("Length : "+args[0].length());
     String s = args[0].toUpperCase(Locale.ROOT);
        System.out.println("UpperCase : "+ s);
        boolean flag = true;
        for (int i = 0 ; i < args[0].length();i++ ){
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("Palindrome : " + "Yes");
        }
        if (flag == false){
            System.out.println("Palindrome : " + "No");
        }
    }


}
