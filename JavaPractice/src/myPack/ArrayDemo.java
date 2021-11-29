package myPack;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;


        for(int i = 0 ; i< arr1.length ; i++){
           System.out.println(arr1[i]);
        }

        //Enhanced for loop


        int []arr2 = {22,3,65,4,78};
        for(int i : arr2){
            System.out.println(i);
        }

        int[] arr3[] = new int[2][2];
        arr3[0][0] = 1;
        arr3[0][1] = 2;
        arr3[1][0] = 3;
        arr3[1][1] = 4;

        System.out.println("1st 2D array : ");
        for (int i = 0 ; i<arr3.length;i++){
            for (int j = 0 ; j<arr3[0].length;j++ ){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        int arr4[][] = new int[3][];
        arr4[0] = new int[]{1,2,3};
        arr4[1] = new int[]{4,5,6,7,8};
        arr4[2] = new int[]{3};

        System.out.println("2nd 2D array : ");
        for (int i = 0 ; i<arr4.length;i++){
            for (int j = 0 ; j<arr4[i].length;j++ ){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }


    }
}
