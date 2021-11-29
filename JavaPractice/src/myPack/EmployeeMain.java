package myPack;

public class EmployeeMain {
    public static void main(String[] a){
        Employee emp = new Employee();
        emp.setID(101);
        emp.setName("Tony");
        emp.setSalary(100000.95f);
        System.out.println("Id is " + emp.getID() + " Name : " + emp.getName() + " Salary : " + emp.getSalary());

    }
}
