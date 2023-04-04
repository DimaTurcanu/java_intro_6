package mock02;

import utilities.RandomGenerator;

import java.util.Arrays;

public class Practice05_Task04 {
    public static void main(String[] args) {
        num();
    } public static void num (){

        int [] arr = new int[5];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = RandomGenerator.getRandomNumber(1, 10);

        if (arr[i]< min) min = arr[i];
        else if (arr[i]> max) max = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(min);

        Arrays.sort(arr);


    }
}
