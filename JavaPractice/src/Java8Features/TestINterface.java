package Java8Features;

public interface TestINterface {
    default void show(){
        System.out.println("Default method from Interface!!!");
    }
    static void display(){
        System.out.println("static method from interface !!!");
    }

    void myMethod();

    /*public static void main(String[] args) {
        TestINterface.display();
        TestINterface obj = new TestINterface() {
            @Override
            public void myMethod() {
                System.out.println("myMethod in TestINterface !!!");
            }
        };

        obj.show();
        obj.myMethod();
    }*/
}
