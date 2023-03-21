package arrays;

import java.util.Arrays;

public class SearchingInAnArray {
    public static void main(String[] args) {

        int [] numbers = {3, 10, 8 , 5, 5};
        boolean exist = false;
        for (int number : numbers) {
            if(number==5) {
                exist = true;
                break;
            }
        }
        System.out.println(exist);

        // Binary Search way

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5)); // return
        System.out.println(Arrays.binarySearch(numbers, 9));
    }
}
