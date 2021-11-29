package IOdemos;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter Message : ");
            String msg  = br.readLine();
            FileWriter writer = new FileWriter("/home/ronit.magar/Documents/ronit/productDetails.txt",true);
            writer.write("\n"+msg);
            writer.flush();
            System.out.println("writing File.......");

            System.out.println("Reading from the file : ");
            FileReader reader = new FileReader("/home/ronit.magar/Documents/ronit/productDetails.txt");
            BufferedReader br1 = new BufferedReader(reader);
            String str = null;
            while ((str = br1.readLine()) != null){
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
