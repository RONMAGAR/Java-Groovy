package Collection;

public class Product implements Comparable<Product> {
    private int pid;
    private String pname;
    private float price;

    public Product(int pid, String pname, float price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }


    public String toString(){
        return "Product-ID : " + pid + " name : " + pname + "Price : "+ price;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public float getPrice() {
        return price;
    }

//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof Product){
//            Product p = (Product) o;
//            if(this.pid > p.pid){
////                return 1;
////            }                             This code is for sorting on the basis of pid
////            else if (this.pid < p.pid){
////                return -1;
////            }
////        }
////        return 0;
//
//        if (o instanceof Product){
//            Product p = (Product) o;
//            return this.pname.compareTo(p.pname);
//
//        }
//        return 0;
//
//
//    }

    public int compareTo(Product p){    // bcoz we have restricted comparable with Product object we dont need to do casting and checkinfs if object
        //passed is of product
        return this.pname.compareTo(p.pname);
    }
}
