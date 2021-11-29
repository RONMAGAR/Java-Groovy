package IOdemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsrerInputDemo {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);//passing object of system class needed
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter message : ");
            String msg = br.readLine();// return type is string
            System.out.println("Message : "+ msg);
            System.out.println("Enter Employee Details : ");
            System.out.println("EnterId : ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter Name : ");
            String name = br.readLine();
            System.out.println("Enter Salary : ");
            float salary = Float.parseFloat(br.readLine());
            System.out.println("ID : "+id);
            System.out.println("Name : "+name);
            System.out.println("Salary : "+salary);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
