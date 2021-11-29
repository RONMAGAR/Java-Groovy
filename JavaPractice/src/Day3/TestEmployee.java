package Day3;

public class TestEmployee {
    public static void main(String[] args) {
        int id = Integer.parseInt(args[0]);
        String name  =args[1];
        float salary  = Float.parseFloat(args[2]);

        if (salary < 10000) {
            try {
                throw new LowSalaryException("Salary is less than 10000");
            } catch (LowSalaryException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
            else{
                Employee emp = new Employee(id,name,salary);
                System.out.println("Employee Details : ");
                System.out.println("ID : " + emp.getId());
                System.out.println("Name : " + emp.getName());
                System.out.println("salary : "+ emp.getSalary());
            }


    }

}
