package Map;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<String,Integer> table = new Hashtable<>();
        table.put("Hello",10);
        table.put("ronit",24);
        table.put("Bye",7);
        table.put("hii",40);
        //table.put("map",null); null value and key not allowed




        System.out.println(table);
    }
}
