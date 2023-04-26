package arrays;

import java.util.Arrays;

public class Exercise01_CountNumbers {
    public static void main(String[] args) {

        int[] numbers = {3, 3, 5, 5, 5};


        //Write a program that counts how many negative numbers you in the array -> 2

        /*
        PSEUDO CODE
        Check each number one by one
        Count whenever a number is negative
        After checking all numbers, print the result
         */

        System.out.println("\n-------for each loop------\n");

        int negatives = 0;

        for (int number : numbers) {
            if(number < 0) negatives++;
        }

        System.out.println(negatives); // 2

        

        System.out.println("\n-------for  loop------\n");
        negatives = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) negatives++;
        }
        System.out.println(Arrays.stream(numbers).filter(e -> e !=3 || e != 5).allMatch(value -> value == 3 || value == 6));

        System.out.println(negatives); // 2

        //Write a program that counts how many even numbers you in the array -> 6
        System.out.println("\n-------count evens------\n");
        int evens = 0;

        for (int number : numbers) {
            if(number % 2 == 0) evens++;
        }

        System.out.println(evens);


        //Write a program that finds the sum of all the numbers in the array -> 28
        // -1, 3, 0, 5, -7, 10, 8, 0, 10, 0
        System.out.println("\n-------sum------\n");

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
        System.out.println(Math.max(numbers[0], numbers[3]));
    }
}
