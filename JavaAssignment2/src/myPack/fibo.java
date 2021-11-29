package myPack;

public class fibo {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println("Two numbers are : " + n1 + "," + n2);

        int flag = 1;
        System.out.print("sequence is : "+ n1 + " " + n2 + " ");
        int first = n1;
        int second = n2;
        int third;
        for (int i = 0;i < 13 ; i++){
            third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }
    }
}
