package homeworks;

import java.time.LocalDate;
import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("\n----------------Task1---------------\n");
        System.out.println(noSpace(""));
        System.out.println(noSpace("   Samsung    is cool    and    fast"));
        System.out.println("\n----------------Task2---------------\n");
        System.out.println(replaceFirstLast("s"));
        System.out.println(replaceFirstLast("str"));
        System.out.println(replaceFirstLast("strudel"));
        System.out.println("\n----------------Task3---------------\n");
        System.out.println(hasVowel("Java"));
        System.out.println(hasVowel("1232"));
        System.out.println(hasVowel("Abc"));
        System.out.println("\n----------------Task4---------------\n");
        checkAge(1993);
        checkAge(2006);
        checkAge(2025);

        System.out.println("\n----------------Task5---------------\n");
        System.out.println(averageOfEdges(-2, 10, -2));
        System.out.println(averageOfEdges(0, 0, 6));
        System.out.println(averageOfEdges(-3, 15, -3));
        System.out.println("\n----------------Task6---------------\n");
        System.out.println(Arrays.toString(noA(new String[]{"ava", "hello", "123", "Axyz"})));
        System.out.println("\n----------------Task7---------------\n");
        System.out.println(Arrays.toString(no3or5(new int[]{7, 4, 11, 23, 17})));
        System.out.println(Arrays.toString(no3or5(new int[]{3, 4, 5, 6})));
        System.out.println(Arrays.toString(no3or5(new int[]{10, 11, 12, 13, 14, 15})));
        System.out.println("\n----------------Task8---------------\n");
        System.out.println(countPrimes(new int[]{7, 4, 11, 23, 17}));

    }


    public static String noSpace(String str) {
        return str.trim().replaceAll("\\s+", " ");

    }

    public static String replaceFirstLast(String str) {
        return str.trim().length() < 2 ? "" : str.charAt(str.length() - 1) +
                str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public static boolean hasVowel(String str) {
        return str.toLowerCase().replaceAll("[^aeiou]", "").length() > 0;
    }

    public static void checkAge(int yearOfBirth) {
        System.out.println(LocalDate.now().getYear() - yearOfBirth < 16 || LocalDate.now().getYear() - yearOfBirth > 100 ? "AGE IS NOT ALLOWED" : "AGE IS ALLOWED");
    }

    public static int averageOfEdges(int a, int b, int c) {
        return (Math.max(Math.max(a, b), c) +
                Math.min(Math.min(a, b), c)) / 2;
    }

    public static String[] noA(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().startsWith("a")) {
                arr[i] = "###";
            }
        }
        return arr;
    }

    public static int[] no3or5(int[] numbers) {
        int[] numbersChanged = new int[numbers.length];
        for (int i = 0; i < numbersChanged.length; i++) {
            if (numbers[i] % 15 == 0) numbersChanged[i] = 101;
            else if (numbers[i] % 5 == 0) numbersChanged[i] = 99;
            else if (numbers[i] % 3 == 0) numbersChanged[i] = 100;
            else numbersChanged[i] = numbers[i];
        }
        return numbersChanged;
    }

    public static int countPrimes(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num <= 1) continue;
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;

                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}

