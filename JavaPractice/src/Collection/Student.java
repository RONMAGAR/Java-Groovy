package Collection;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
    public int hashCode(){
        return rollNo; // here we are overriding hashCode bcoz in HashSetDemo  we are getting duplicate objects of student class
    }

// when roll no is same the code behind hashCode refers two same roll no to same hashcode(as we have set hashcode to roll no)
    // when hashcode becomes same then it will look for character to character check so now we override equals method from object class
    public boolean equals(Object e){
        Student s = (Student) e;// downcasting
        if (this.name.equals(s.name) && this.percentage == s.percentage){
            return true;   // here if name and percentage are equal we will return true to tell that objects are same
        }
        return false;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public float getPercentage() {
        return percentage;
    }

    private int rollNo;
    private String name;
    private float percentage;

    public Student(int rollNo, String name, float percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }


}
