package mypack1;
// hashCode

//toString
public class Product implements Cloneable{
    private int Id;
    private String Name;
    private float salary;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public float getSalary() {
        return salary;
    }

    public Product(int id, String name, float salary) {
        Id = id;
        Name = name;
        this.salary = salary;
    }

    public int hashCode(){
        return Id;
    }

    public String toString(){
        return "Id :" + Id + "Name :" + Name + "Price : " + salary;
    }

   public boolean equals(Object obj){
        Product p = (Product) obj;
        if (this.Id == p.Id && this.Name.equals(p.Name) && this.salary == p.salary){
            return true;
        }
        return false;
   }
    public void finalize(){
        System.out.println("finalize method of Product : ");
    }

//    public static void main(String[] args) throws CloneNotSupportedException{
//        Product p1 = new Product(101,"book",200);
//        System.out.println("p1 : " + p1);
//        Product p2 =  (Product) p1.clone();
//        System.out.println("p2 : " + p2);
//    }
    public Object clone(){
        return this;
    }
}
