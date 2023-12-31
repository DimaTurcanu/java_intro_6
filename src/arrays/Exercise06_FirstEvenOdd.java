package arrays;

import java.util.Arrays;

public class Exercise06_FirstEvenOdd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        int even = 1;

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
                break;
            }

        }
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
                break;
            }

        }
        System.out.println(Arrays.stream(numbers).filter(e -> e % 2 == 0).count());

        System.out.println("\n-------Using one loop-------\n");

        boolean isEvenFound = false; // true
        boolean isOddFound = false; // true

        for (int number : numbers) { // 5

            if(!isEvenFound && number % 2 == 0){
                System.out.println(number); // 0
                isEvenFound = true;
            }
            else if(!isOddFound && number % 2 == 1){
                System.out.println(number); // 5
                isOddFound = true;
            }

            if(isEvenFound && isOddFound) break; // When both are found, break the loop
        }
    }
}
