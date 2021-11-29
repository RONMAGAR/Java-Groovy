package Collection;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product>{
    /*@Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Product && o2 instanceof Product){
            Product p1 = (Product) o1;
            Product p2 = (Product) o2;
            if (p1.getPid() > p2.getPid()){
                return 1;
            }
            else if (p1.getPid() < p2.getPid()){
                return -1;
            }
        }
        return 0;
    }*/

    public int compare(Product p1,Product p2){
        return p1.getPid() - p2.getPid();
    }
}
