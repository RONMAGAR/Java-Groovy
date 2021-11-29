package myPack;

public class TestAccess {
    public static void main(String[] args) {
        AccessDemo ab = new AccessDemo();

        ab.display();
        //a.show();private not allowed
        ab.print();
        ab.publicshow();
    }

}
