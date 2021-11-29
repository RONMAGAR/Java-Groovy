package myPack;

public class AccessDemo {
    private void show(){
        System.out.println("Private");
    }
    void display(){
        System.out.println("default");
    }
    protected void print(){
        System.out.println("protected");
    }
    public void publicshow(){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        AccessDemo a = new AccessDemo();
        a.display();
        a.show();
        a.print();
        a.publicshow();
    }
}
