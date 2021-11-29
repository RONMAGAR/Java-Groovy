package mypack1;
import myPack.AccessDemo;

public class TestAccess1 extends AccessDemo{
    public static void main(String[] args) {
        AccessDemo ab = new AccessDemo();

        //ab.display(); Default not allowed outside package
        //a.show();private not allowed
        //ab.print(); when protected gets inherited than it becomes private to access protected
        // to access protected
        TestAccess1 t = new TestAccess1();
        t.print();
        ab.publicshow();
    }
}
