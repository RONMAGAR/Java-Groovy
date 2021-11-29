package Assignments;

public class CalcAverage {
    public static double avgFirst(int N) {
        double M = (double) N;
        if (N < 1) {
            try {
                throw new IllegalArgumentException("Number should be a Natural number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return 0;
            }

        } else {
            return ((((M + 1) * (M)) / 2) / M);
        }
    }



    public static void main(String[] args) {
        CalcAverage obj = new CalcAverage();
        System.out.println(obj.avgFirst(0));
    }
}
