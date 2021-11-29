package InnerClasses;

public class MethodLocalDemo {
    private int number;
    private static String msg;
    public void show(){
        System.out.println("In show()!!!");
        System.out.println("Number : " + number );
        System.out.println("Msg : "+ msg);
    }
    public void display(String str){
        class LocalInner{  //scope will be only inside the method
            void myMethod(){
                number =100;  // access everthing
                msg = "hi";
                show();
                System.out.println("str : "+str);
            }
        }
        LocalInner obj = new LocalInner();
        obj.myMethod();
    }

    public static void main(String[] args) {
        MethodLocalDemo obj = new MethodLocalDemo();
        obj.display("hellllooooo!");
    }
}
