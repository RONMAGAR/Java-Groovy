package myPack;

public class ManagerMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(100000);
        emp.setName("Stark");
        emp.setID(102);
        System.out.println("Employee details : ");

        System.out.println("ID : " + emp.getID());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary : " + emp.getSalary());

        Manager mng = new Manager();
        mng.setID(103);
        mng.setName("tony");
        mng.setSalary(1000000);
        mng.setProjectId(1002);
        mng.setProjectName("java");
       System.out.println("-------------------");
        System.out.println("Manager Details : ");
        System.out.println("ID : " + mng.getID());
        System.out.println("Name: " + mng.getName());
        System.out.println("Salary : " + mng.getSalary());
        System.out.println("ProjectID: " + mng.getProjectId());
        System.out.println("ProjectName: " + mng.getProjectName());

    }
}
