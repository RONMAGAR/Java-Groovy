package Map;

public class Employee {
    private int id;
    private String name;
    private float salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int hashCode(){
        return id;
    }
    public boolean equals(Object obj){
        if (obj instanceof Employee){
            Employee em = (Employee) obj;
            if (this.name.equals(em.name) && this.salary == em.salary ){
                return  true;
            }
        }
        return false;
    }
}
