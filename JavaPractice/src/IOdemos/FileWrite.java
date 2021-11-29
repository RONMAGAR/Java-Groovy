package IOdemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {


    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("/home/ronit.magar/Documents/ronit/outputcreated.txt",true);
            String msg = "HELLO FILE CREATED USING";
            fout.write(msg.getBytes());
            System.out.println("Writing message!!!");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException iex){
            iex.printStackTrace();
        }
    }
}
