package arrays;

import java.util.Arrays;

public class IntArray {
    public static void main(String[] args) {

        // Create an int array that will store 6 numbers

        int[] numbers = new int[6];

        // Print the array

        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0, 0]

        // How to assign a value to an existing index

        numbers[0] = 5;
        numbers[2] = 15;
        numbers[4] = 25;

        // numbers [7] // Array Index out of bound exception

        System.out.println(Arrays.toString(numbers)); // [5, 0, 15, 0, 25, 0]

        numbers[0] = 7;
        System.out.println(Arrays.toString(numbers)); // [7, 0, 15, 0, 25, 0]

        //Print each element with for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        //Print each element with for each loop - enhanced for loop for collections

        for (int element : numbers) {
            System.out.println(element);

            for (int number : numbers) {
                System.out.println(number);
            }


        }

    }
}
