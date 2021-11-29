package Features;

import java.util.Scanner;

public class TestSeason {
    public static void main(String[] args) {
        System.out.println("Enter Season : ");
        Scanner sc  = new Scanner(System.in);
        String input = sc.next();
        Season[] seasons = Season.values();// values is a method in ENUM CLASS which will return u
        // the array of set of constants
        boolean status = false;
        for (Season s: seasons){
            if (s.toString().equalsIgnoreCase(input)){
                System.out.println("Valid Season!!!");
                status = true;
                break;
            }

        }
        if (status == false){
            System.out.println("Invalid Season!!!");
        }
        Season.SUMMER.display();

    }
}
