package IOdemos;

import java.io.*;
import java.util.Scanner;

public class WritingObject  {
    public static void main(String[] args) {
        FileOutputStream fout = null ;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter id : ");
            int id = sc.nextInt();
            System.out.println("Enter name : ");
            String name = sc.next();
            System.out.println("Enter salary : ");
            float salary = sc.nextFloat();

            Employee emp = new Employee(id,name,salary);

             fout = new FileOutputStream("/home/ronit.magar/Documents/ronit/FileObject.txt");

            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(emp);// here as Employee class is implemented from the serializable ,writeObject will automatically convert object into byte code

            System.out.println("Writing Employee object!!!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (fout != null)
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
