package IOdemos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingProductDetails {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/home/ronit.magar/Documents/ronit/productDetails.txt");
            DataInputStream data = new DataInputStream(fin);
            System.out.println("Product details : ");
            System.out.println("product ID : "+data.readInt());
            System.out.println("Product name : "+data.readUTF());
            System.out.println("Price : "+ data.readFloat());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
