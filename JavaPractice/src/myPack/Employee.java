package myPack;

public class Employee {

    private int id;
    static int ron = 10;

    private String name;
    private float salary;

    public void setID(int i){
        id = i;

    }
    public int getID(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setSalary(float n){
        salary = n;
    }
    public float getSalary(){
        return salary;
    }

}
