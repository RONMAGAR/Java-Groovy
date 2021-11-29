package Collection;

import java.util.Iterator;
import java.util.TreeSet;
// Its a sorted collection
public class TreeSetDemo {
    public static void main(String[] args) throws RuntimeException {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(10);
        set.add(11);// it will give error as its double and while comparing for sorting sequence it will create
        //different objects for doble,int,float
        set.add(9);
        set.add(30);
        set.add(20);

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("hello");
        set1.add("123");
        set1.add("apple");
        set1.add("zebra");
        set1.add("abcd");

        Iterator itr1 = set1.iterator();
        System.out.println(set1);


        TreeSet<Product> set2 = new TreeSet<>(new ProductComparator());// it will tell compare according to ProductComparator
        // to sort product the basis of ID we have to override compareTo() from product.java class
        set2.add(new Product(101," mobile",100000));
        set2.add(new Product(103," Laptop",200000));
        set2.add(new Product(102," TV",300000));
        set2.add(new Product(104," earphone",40000));
        System.out.println("Product sorted on the basis of ID : ");
        Iterator<Product> itr2 = set2.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("-------------------------------");
        TreeSet<Product> set3 = new TreeSet<>();
        // to sort product the basis of product name we have to override compareTo() from product.java class
        set3.add(new Product(101," mobile",100000));
        set3.add(new Product(103," Laptop",200000));
        set3.add(new Product(102," TV",300000));
        set3.add(new Product(104," earphone",40000));
        System.out.println("Product sorted on the basis of product name ");
        Iterator<Product> itr3 = set3.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }



// here we get same comparision even if we compared on the basis of different prameters like pid,pname
// so for that we make class ProductComparator


    }
}
