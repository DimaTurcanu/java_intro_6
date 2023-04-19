package arrays;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {
        int [] number = new int[5];
        double [] doubles = new double[5];
        int n = 4;
        String[] numbers = new String[n];
        if (n == 0) System.out.println(Arrays.toString(numbers));
        for (int i = 0; i<n; i++){
            numbers[i] = String.valueOf(i);
        }
        System.out.println(Arrays.toString(numbers));



    }
}
