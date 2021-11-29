package myPack;

public class ArrayCheck {
    static void displayBingoo(){
        System.out.println("It's Bingoo!!");
    }
    static void displaynoBingoo(){
        System.out.println("It's not Bingoo!!");
    }
    public static void main(String[] args) {
       int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        if ((n1 > 40) || (n1 < 1) || (n2 > 40) || (n2 < 1)  ){
            System.out.println("Out of range value!!!");

        }
        else {
            System.out.println("First Number : " + n1);
            System.out.println("Second Number : " + n2);

            int[] arr = {7,25,5,19,30};
            int p1 = 0,p2 = 0;
            for (int i=0;i<arr.length;i++){
                if (arr[i] == n1){
                    p1 = 1;
                }
                if (arr[i] == n2){
                    p2 =1;
                }

            }

            if(p1==1){
                displayBingoo();
            }
            else {
                displaynoBingoo();
            }
            if (p2==1){
                displayBingoo();
            }
            else {
                displaynoBingoo();
            }
        }


    }
}
