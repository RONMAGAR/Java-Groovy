package mypack1;

public class InterfaceMain implements InterfaceDemo {
    public  void display(){ // declare it compulsory public because while inheriting it will change
        // its original form of being public from main interface class
        System.out.println("display in TestChild!!!");
    }
    public void print(){
        System.out.println("print() in InterfaceDemo!!");
    }

    public static void main(String[] args){
        InterfaceDemo obj = new InterfaceMain();
        obj.display();
        ((InterfaceMain) obj).print();// need to down cast
        //obj.show();
    }

    public void show(String msg){
        System.out.println("show in interfacemain : " + msg);
    }
}
