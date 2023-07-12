package homeworks;


public class Homework17 {
    public static void main(String[] args) {
        // Test Task 1
        System.out.println(nthWord("I like programming languages", 2)); // Output: like
        System.out.println(nthWord("QA stands for Quality Assurance", 4)); // Output: Quality
        System.out.println(nthWord("Hello World", 3)); // Output:

        // Task 2
        System.out.println(isArmstrong(153)); // Output: true
        System.out.println(isArmstrong(123)); // Output: false

        // Task 3
        System.out.println(reverseNumber(371)); // Output: 173
        System.out.println(reverseNumber(12)); // Output: 21
    }

    // Task 1
    public static String nthWord(String sentence, int n) {
        String[] words = sentence.split("\\s+");
        if (n <= 0 || n > words.length) {
            return "";
        }
        return words[n - 1];
    }

    // Task 2
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Task 3
    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}

