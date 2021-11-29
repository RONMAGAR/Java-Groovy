package IOdemos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) {
        File file = new File("/home/ronit.magar/Documents/ronit/Files.txt");

        if (file.exists()){
            try {
                FileInputStream fin = new FileInputStream(file);
                int ch = 0;
                while ((ch = fin.read()) != -1){
                    System.out.print((char) ch);
                }
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
            catch (IOException ie){
                ie.printStackTrace();
            }

        }
        else {
            System.out.println("File not Exists");
        }


    }
}
