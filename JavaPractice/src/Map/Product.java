package Map;

public class Product implements Comparable<Product>/* restricting to product type to avoid downcasting */{
    private int pid;
    private String pname;
    private float price;

    public Product(int pid, String pname, float price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pid : " + pid + " Name : " + pname +" Price : " + price ;
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

    @Override
    public int compareTo(Product product) {
        if (this.price > product.price){
            return 1;
        }
        else if(this.price < product.price){
            return -1;
        }
        return 0;
    }
}
