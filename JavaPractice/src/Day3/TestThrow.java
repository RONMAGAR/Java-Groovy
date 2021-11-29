package Day3;

public class TestThrow {
    void division(int a,int b){
//        if (b==0){
//            throw new ArithmeticException();
//        }
        if(b==0){
            try {
                throw new ArithmeticException();
                //System.out.println("Hello");
            }catch (ArithmeticException e){
                System.out.println("Division by Zero Not possible!!!");
            }
        }
     else {
            System.out.println("Division Result : " + (a / b));
            System.out.println("End of Division !!!");
        }
    }



    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        obj.division(10,0);
        System.out.println("end of main!!");
    }
}
