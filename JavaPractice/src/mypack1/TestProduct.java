package mypack1;

public class TestProduct {
    public static void main(String[] args) {
        Product prod1 = new Product(101,"ronit",1000000);
        System.out.println("hash code : " + prod1.hashCode());

        Product prod2 = new Product(102,"tony",100000);
        System.out.println("hash code : " + prod2.hashCode());

        System.out.println("hash code : " + prod2);
        System.out.println("hash code : " + prod2);

        System.out.println("toString object : " + prod1.toString());


        Product prod3 = new Product(101,"ronit",1000000);
        System.out.println("prod1 equals prod2 : " + prod1.equals(prod2));
        System.out.println("prod1 equals prod3 : " + prod1.equals(prod3));

       prod1 = prod2;
       System.gc();//it gets accepted when there is object with no reference in the meemory
        // prod1.clone();

        Product p1 = (Product) prod1.clone();
        System.out.println("clone of prod1 : " + p1);
    }


}
