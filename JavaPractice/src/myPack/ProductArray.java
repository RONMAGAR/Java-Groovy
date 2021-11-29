package myPack;

public class ProductArray {
    public static void main(String[] args) {
        Product[] arr = new Product[3];
        arr[0] = new Product();
        arr[1] = new Product();
        arr[2] = new Product();


        arr[0].setPid(101);
        arr[0].setPname("Mobile");
        arr[0].setPrice(100000);

        arr[1].setPid(102);
        arr[1].setPname("charger");
        arr[1].setPrice(10000);

        arr[2].setPid(103);
        arr[2].setPname("Earphones");
        arr[2].setPrice(20000);


        for (Product i : arr){
            System.out.println("ID : " + i.getPid() + "| Product : " + i.getPname() + "| Price : " + i.getPrice());
        }


    }
}
