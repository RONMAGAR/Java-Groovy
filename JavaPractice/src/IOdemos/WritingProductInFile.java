package IOdemos;

import java.io.*;

public class WritingProductInFile {
    public static void main(String[] args) {
        try {
            InputStreamReader in  = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter Product details : ");
            System.out.println("Enter Product ID : ");
            int pid = Integer.parseInt(br.readLine());
            System.out.println("Enter Product Name : " );
            String pname  = br.readLine();
            System.out.println("enter product price : ");
            float price = Float.parseFloat(br.readLine());

            FileOutputStream fout = new FileOutputStream("/home/ronit.magar/Documents/ronit/productDetails.txt");
            DataOutputStream data = new DataOutputStream(fout);
            data.writeInt(pid);
            data.writeUTF(pname);
            data.writeFloat(price);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
