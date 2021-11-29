package Map;

import Collection.ProductComparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
//Sorted Map on the basis of key
public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String,Integer> map1 = new TreeMap<>();
        map1.put("bye",10);
        map1.put("hii",20);
        map1.put("hello",30); // will get sorted alphabetically
        map1.put("map",40);
        map1.put("bye",50);// replace old value with new one
        System.out.println("1st Tree Map : ");
        System.out.println(map1);

        TreeMap<Integer,String> map2 = new TreeMap<>();
        map2.put(50,"Bye");
        map2.put(10,"Hello"); // will get sorted on the basis on key
        map2.put(30,"hello");
        map2.put(40,"Collection");
        map2.put(50,"welcome");
        System.out.println("2nd Tree Map : ");
        System.out.println(map2);

        System.out.println("Sorting on the basis of price : --------------");
        TreeMap<Product,String> map3 = new TreeMap<>();
        map3.put(new Product(101,"Mobile",56000),"Electronics");
        map3.put(new Product(102,"Laptop",98000),"Electronics");
        map3.put(new Product(103,"Book",300),"stationary");
        map3.put(new Product(104,"Pen",200),"stationary");
        System.out.println("3rd Treemap : ");
        Set<Product> keyset = map3.keySet();
        Iterator<Product> it = keyset.iterator();
        while (it.hasNext()){
            Product p = it.next();
            System.out.println(p + " : "+map3.get(p)); // sorted on the basis of price by overriding compareTo() in Product.java

        }

//
//        System.out.println("Sorting on the basis of name : --------------------------");
//        TreeMap<Product,String> map4 = new TreeMap<Product, String>(new ProductComparator());
//        map4.put(new Product(101,"Mobile",56000),"Electronics");
//        map4.put(new Product(102,"Laptop",98000),"Electronics");
//        map4.put(new Product(103,"Book",300),"stationary");
//        map4.put(new Product(104,"Pen",200),"stationary");
//       System.out.println("3rd Treemap : ");
//        Set<Product> keyset1 = map4.keySet();
//        Iterator<Product> it2 = keyset1.iterator();
//        while (it2.hasNext()){
//          Product p = it2.next();
//           System.out.println(p + " : "+map4.get(p));
//
//        }

    }
}
