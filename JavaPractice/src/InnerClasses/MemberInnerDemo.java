package InnerClasses;

public class MemberInnerDemo {
   private int number;
   private static String msg;

   public void display(){
       number = 10;
       msg = "hello";
       System.out.println("NUMBER in display : " + number + " Message in display : "+msg);

   }
   class InnerClass{
       void show(){
           System.out.println("Member Inner Demo");
           display();
           number=20;
           System.out.println("Number : " + number);
           System.out.println("Msg : " + msg);

       }
   }

    public static void main(String[] args) {
        MemberInnerDemo obj = new MemberInnerDemo();
        obj.display();
        MemberInnerDemo.InnerClass inner = obj.new InnerClass();
        inner.show();
    }
}
