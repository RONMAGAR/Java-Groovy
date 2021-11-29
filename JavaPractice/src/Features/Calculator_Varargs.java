package Features;

public class Calculator_Varargs {

    int add(int a,int b,int... c){
        int result = a+b;
        for (int r : c){
            result = result + r;
        }
        return result;
    }
    public static void main(String[] args) {
        Calculator_Varargs obj = new Calculator_Varargs();
        System.out.println("Addition result : "+obj.add(+10,20));
        int result = obj.add(10,20,30,40,50);
        System.out.println("Addition result " +result);


    }
}
