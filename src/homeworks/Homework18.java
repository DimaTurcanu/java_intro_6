package homeworks;

import java.util.Arrays;

public class Homework18 {

    public static int[] doubleOrTriple(int[] array, boolean doubleValue) {
        int multiplier = doubleValue ? 2 : 3;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * multiplier;
        }
        return array;
    }

    public static String splitString(String input, int splitBy) {
        int length = input.length();

        if (length % splitBy != 0) {
            return "";
        }


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i += splitBy) {
            String chunk = input.substring(i, i + splitBy);
            result.append(chunk).append(" ");
        }

        return result.toString().trim();
    }

    public static int countPalindrome(String input) {
        String[] words = input.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Task-1
        int[] array1 = {1, 5, 10};
        boolean doubleValue1 = true;
        int[] result1 = doubleOrTriple(array1, doubleValue1);
        System.out.println("Task-1 Output 1: " + Arrays.toString(result1));

        int[] array2 = {3, 7, 2};
        boolean doubleValue2 = false;
        int[] result2 = doubleOrTriple(array2, doubleValue2);
        System.out.println("Task-1 Output 2: " + Arrays.toString(result2));

        // Task-2
        String input1 = "Java";
        int divisor1 = 2;
        String result3 = splitString(input1, divisor1);
        System.out.println("Task-2 Output 1: " + result3);

        String input2 = "JavaScript";
        int divisor2 = 5;
        String result4 = splitString(input2, divisor2);
        System.out.println("Task-2 Output 2: " + result4);

        String input3 = "Hello";
        int divisor3 = 3;
        String result5 = splitString(input3, divisor3);
        System.out.println("Task-2 Output 3: " + result5);

        // Task-3
        String input4 = "Mom and Dad";
        int palindromeCount1 = countPalindrome(input4);
        System.out.println("Task-3 Output 1: " + palindromeCount1);

        String input5 = "Kayak races attracts racecar drivers";
        int palindromeCount2 = countPalindrome(input5);
        System.out.println("Task-3 Output 2: " + palindromeCount2);
    }
}
