package myPack;

public class Student {
    private int rollNo;
    private String name;
    private float percentage;

    public Student(int r, String n,float p){
        System.out.println("Parameterized constructor");
        rollNo = r;
        name = n;
        percentage = p;

    }

    public Student(){
        System.out.println("Default parameter");
    }

    public static void main(String[] args) {
        Student obj = new Student(101,"ronit",99.99f);
        System.out.println(obj.name + " " + obj.rollNo + " " + obj.percentage);

    }
}
