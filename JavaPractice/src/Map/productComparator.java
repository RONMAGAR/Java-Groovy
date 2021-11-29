package Map;

import java.util.Comparator;

public class productComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {

        return p1.getPname().compareTo(p2.getPname());
    }
}
