package Day3;

public class finalDemo {

    private final int NUMBER = 200;

    public static void main(String[] args) {
        finalDemo obj = new finalDemo();
        System.out.println("NUMBER : " + obj.NUMBER);
    }

    final void display(){
        System.out.println("Display in finalDemo");
    }
}


class childfinalDemo extends finalDemo{
//    void display(){
//        cannot be override as it is declared  final
//    }

    //final class cannot be inerited
}