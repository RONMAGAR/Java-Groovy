package Java8Features;

public class TestInterfaceChild implements TestINterface{

    @Override
    public void myMethod() {
        System.out.println("myMethod() in TestInterfaceChild !!!!");
    }

    public static void main(String[] args) {
        TestINterface.display();
        TestInterfaceChild obj = new TestInterfaceChild();
        obj.show();
        obj.myMethod();
    }
}
