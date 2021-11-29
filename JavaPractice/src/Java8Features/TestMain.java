package Java8Features;


public class TestMain {
    public static void main(String[] args) {
        /*Test test = new Test() {
            @Override
            public void show(String str) {
                System.out.println("show() in Test !!!");
            }
        };*/
        Test test1 =() -> {
            System.out.println("show() in Test!!! - in lambda");
        };
        test1.show();

        Printer printer = msg -> {  // if method is having only one argument we can ommit paranthesis as well of (msg), if there is any return
            // statement in the method implementation han brackets are compulsory
            System.out.println("print(String) in Printer : msg : "+ msg);
            System.out.println("This is lambda Expression demo !!!");
        };
        printer.print("Hello");

       Calculator obj =(a,b) ->{
           return a+b;
       };
       int result = obj.add(10,20);
        System.out.println("Addition Result : " + result);

        Calculator obj1 = (a,b) -> (a+b); //if it is not returning anything than curly brackets are not compulsory

    }
}
