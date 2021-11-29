package myPack;

public class SubClass extends SuperClass {
    void display(){
        System.out.println("display in child!!");
    }

//    public SubClass getObject(){
//        return new SubClass();
//    }
    void show(String s)
    {
        System.out.println("show in child !!!" + s);
    }


    public static void main(String[] args) {
        SuperClass obj = new SuperClass();
        obj.display();
        SubClass obj1 = new SubClass();
        obj1.display();
        obj = new SubClass();
        //obj.show("ron");
        obj.display();
        obj.print();

        // it will call child display , this is known as method overriding
        if (obj instanceof SubClass){
            ((SubClass)obj).show("ronit");//We have casted and changed reference from display()child to show()chid

        }

    }
}
