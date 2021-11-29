package IOdemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObject {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/home/ronit.magar/Documents/ronit/FileObject.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Employee emp = (Employee) in.readObject();// return type is object so we have to downcast
            System.out.println("employee details : ");
            System.out.println("Id : "+ emp.getId());
            System.out.println("Name : "+ emp.getName());
            System.out.println("salary : " + emp.getSalary());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
