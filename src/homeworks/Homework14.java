package homeworks;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println("----------------Task1--------------");
            fizzBuzz1(15);
        System.out.println("----------------Task2--------------");
        System.out.println(fizzBuzz2(3));   // Fizz
        System.out.println(fizzBuzz2(5));   // Buzz
        System.out.println(fizzBuzz2(15));  // FizzBuzz
        System.out.println(fizzBuzz2(7));   // 7

        System.out.println("----------------Task3--------------");
        System.out.println(findSumNumbers("abc123xyz45"));  // 168
        System.out.println(findSumNumbers("1a2b3c4d"));     // 10
        System.out.println(findSumNumbers("12xyz34"));      // 46
        System.out.println(findSumNumbers("abcxyz"));       // 0

        System.out.println("----------------Task4--------------");
        System.out.println(findBiggestNumber("abc$"));       // 0
        System.out.println(findBiggestNumber("a1b4c  6#"));  // 6
        System.out.println(findBiggestNumber("ab110c045d")); // 110
        System.out.println(findBiggestNumber("525"));        // 525

        System.out.println("----------------Task5--------------");
        System.out.println(countSequenceOfCharacters(""));      // ""
        System.out.println(countSequenceOfCharacters("abc"));   // "1a1b1c"
        System.out.println(countSequenceOfCharacters("aabbcca")); // "1a2b2ca"
        System.out.println(countSequenceOfCharacters("aaAAa"));  // "2a2A1a"
    }
        public static void fizzBuzz1(int n) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
                else if (i % 3 == 0) System.out.println("Fizz");
                else if (i % 5 == 0) System.out.println("Buzz");
                else System.out.println(i);
            }
        }

        public static String fizzBuzz2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        else if (n % 3 == 0) return "Fizz";
        else if (n % 5 == 0) return "Buzz";
        else return String.valueOf(n);
        }

        public static int findSumNumbers(String input) {
        String[] numbers = input.replaceAll("\\D+", " ").split(" ");
        int sum = 0;
        for (String number : numbers) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

        public static int findBiggestNumber(String input) {
        if(input.replaceAll("\\D", "").isEmpty()) return 0;
        String[] numbers = input.split("\\D");
            Arrays.sort(numbers);

        return Integer.parseInt( numbers[numbers.length-1]);
    }

        public static String countSequenceOfCharacters(String input){
            if (input.isEmpty()) return "";


            StringBuilder result = new StringBuilder();
            int count = 1;
            char currentChar = input.charAt(0);

            for (int i = 1; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == currentChar) {
                    count++;
                } else {
                    result.append(count).append(currentChar);
                    count = 1;
                    currentChar = ch;
                }
            }

            result.append(count).append(currentChar);
            return result.toString();
        }
    }

