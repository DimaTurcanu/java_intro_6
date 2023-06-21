package homeworks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework15 {

        public static void main(String[] args) {
            System.out.println("---------------------Task1---------------------");
            System.out.println(Arrays.toString(fibonacciSeries1(3)));
            System.out.println(Arrays.toString(fibonacciSeries1(6)));
            System.out.println("---------------------Task2---------------------");
            System.out.println(fibonacciSeries2(4));
            System.out.println(fibonacciSeries2(8));
            System.out.println("---------------------Task3---------------------");
            System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{})));
            System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
            System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
            System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));
            System.out.println("---------------------Task4---------------------");
            System.out.println(firstDuplicate(new int[]{}));                            // Expected Result: -1
            System.out.println(firstDuplicate(new int[]{1}));                           // Expected Result: -1
            System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));                  // Expected Result: 2
            System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));
            System.out.println("---------------------Task5---------------------");
            System.out.println("---------------------Task6---------------------");
        }
        public static int[] fibonacciSeries1(int n) {
            int[] fibonacci = new int[n];

            if (n >= 1) fibonacci[0] = 0;
            if (n >= 2) fibonacci[1] = 1;

            for (int i = 2; i < n; i++)
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

            return fibonacci;
        }
        public static int fibonacciSeries2(int n) {
            if (n <= 1) return 0;
                else if (n == 2) return 1;


            return fibonacciSeries2(n - 2) + fibonacciSeries2(n - 1);

    }
        public static int[] findUniques(int[] arr1, int[] arr2){
            Set<Integer> uniqueSet = new HashSet<>();
            for (int num : arr1) {
                uniqueSet.add(num);
            }
            for (int num : arr2) {
                uniqueSet.add(num);
            }

            int[] result = new int[uniqueSet.size()];
            int index = 0;
            for (int num : uniqueSet) {
                result[index++] = num;
            }

            return result;
        }
        public static int firstDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
}

