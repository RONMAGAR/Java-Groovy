package Day3;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer obj1 = new Integer(10);
        System.out.println("obj1 : " + obj1);

        Float obj2 = new Float("10.5f");
        obj2 = obj2 + 3;//auto unboxing and auto boxing
        System.out.println("obj2 : " + obj2);

        Double obj3 = new Double(30.3);
        System.out.println("obj3 : " + obj3);

        int a = obj1.intValue();//unboxing done from oject wrapper to int

        Short obj4 = 5; // auto boxing

        System.out.println("obj4 : " + obj4);

        Integer obj5 = 35;
        obj5 = obj5 + 3;
        System.out.println("obj5 : " + obj5);


        Double obj6 = Double.valueOf(50.55); //Boxing
        System.out.println("obj6 : " + obj6);

        Float obj7 = Float.valueOf(50.55f); //Boxing
        System.out.println("obj6 : " + obj7);

        short s  = Short.parseShort("10");
        System.out.println("s : " + s);

    }
}
