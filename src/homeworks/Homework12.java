package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("--------------Task1-----------------");
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noDigit("java"));
        System.out.println("--------------Task2-----------------");
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("124$"));
        System.out.println("--------------Task3-----------------");
        System.out.println(sumOfDigits("123day"));
        System.out.println(sumOfDigits("java"));
        System.out.println(sumOfDigits("john is 29"));
        System.out.println("--------------Task4-----------------");
        System.out.println(hasUpperCase("power"));
        System.out.println(hasUpperCase("Hover"));
        System.out.println(hasUpperCase("poWer"));
        System.out.println("--------------Task5-----------------");
        System.out.println(middleInt(1, 4, 5));
        System.out.println(middleInt(-10, 44, 32));
        System.out.println(middleInt(13, 4, 19));
        System.out.println("--------------Task6-----------------");
        System.out.println(Arrays.toString(no13(new int[]{4, 13, 44, 33})));
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13, 13})));
        System.out.println("--------------Task7-----------------");
        System.out.println(Arrays.toString(arrFactorial(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{0, 5})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{5 , 0, 6})));
        System.out.println(factorial(7));
        System.out.println("--------------Task8-----------------");
        System.out.println(Arrays.toString(categorizeCharacters("     ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));
    }

    public static String noDigit(String str){
        return str.replaceAll("\\d", "");
    }

    public static String noVowel(String str){
        return str.toLowerCase().replaceAll("[aeiou]", "");
    }

    public static String sumOfDigits(String str){
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return String.valueOf(sum);
    }

    public static boolean hasUpperCase(String str){
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                return true;
        }return false;
    }

    public static int middleInt(int a, int b, int c){
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        return nums[1];
    }

    public static int[] no13(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) result[i] = 0;
            else result[i] = arr[i];
        }
        return result;
    }

    public static int[] arrFactorial(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = factorial(arr[i]);
        }
        return result;
    }

    public static int factorial(int n) {
        if (n == 0)  return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static String[] categorizeCharacters(String str){
        String[] result = new String[3];
        result[0] = ""; // letters
        result[1] = ""; // digits
        result[2] = ""; // specials

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) result[0] += c; // Add to letters
            else if (Character.isDigit(c)) result[1] += c; // Add to digits
            else result[2] += c; // Add to specials
        }
        return result;
        }
    }


