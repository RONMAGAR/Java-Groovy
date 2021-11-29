package IOdemos;

import java.io.Serializable;

public class Employee implements Serializable {// serializable will convert state of object into bytestream.
    private int Id;
    private String name;
    private float salary;


    public Employee(int id, String name, float saalary) {
        Id = id;
        this.name = name;
        this.salary = saalary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


}
