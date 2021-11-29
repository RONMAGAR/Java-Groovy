package ArrayProblem;

public class ArrayProb {
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        int sum = 0 ;
        int psum = 0;
        int mini = arr[0];

        for(int i = 0; i < arr.length;i++) {
            if (mini > arr[i] && i<=14) {
                mini = arr[i];
            }
            sum = sum + arr[i];
            if (i <= 14) {
                psum = psum + arr[i];
            }
        }

            arr[15] = psum;
            arr[16] = (int) sum/18;
            arr[17] = mini;
            for (int i = 0; i < arr.length ; i++ ){
                System.out.print(arr[i] + " ");
            }
        }
    }

