package Assignments;

public class HRA {
    private int empId;
    private String empName;
    private String designation;
    private double basic;
    private double hra;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getHra() {
        return hra;
    }

    void printDET(){
        System.out.println("Name : " + empName);
        System.out.println("Employee ID : " + empId);
        System.out.println("designation : " + designation);
        System.out.println("basic : " + basic);
    }
    public double calHRA(){
        if (designation == "Manager"){
            return 0.1*basic;
        }
        if (designation == "Officer"){
            return 0.12*basic;
        }
        if (designation == "Clerk"){
            return 0.05*basic;
        }
        return 0;
    }
    public HRA(int empId, String empName, String designation, double basic) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
        if (basic < 500){
            try {
                throw new LowSalaryException("Salary is Low!!! Less than 500");
            }catch (LowSalaryException e){
                 e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        HRA obj = new HRA(101,"tony","Clerk",430);
    }

}
