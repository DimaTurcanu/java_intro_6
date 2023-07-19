package homeworks;

import java.util.Arrays;

public class Homework19 {

    // Task-1
    public static int sum(int[] nums, boolean isEvenIndex) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i % 2 == 0 && isEvenIndex) || (i % 2 != 0 && !isEvenIndex)) {
                sum += nums[i];
            }
        }
        return sum;
    }

    // Task-2
    public static String nthChars(String str, int n) {
        if (str.length() < n) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Task-3
    public static boolean canFormString(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        return Arrays.equals(str1Chars, str2Chars);
    }

    // Task-4
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        return Arrays.equals(str1Chars, str2Chars);
    }

    public static void main(String[] args) {
        // Task-1 Test Data
        int[] nums1 = {1, 5, 10};
        int[] nums2 = {3, 7, 2, 5, 10};
        boolean isEvenIndex1 = true;
        boolean isEvenIndex2 = false;

        System.out.println("Task-1:");
        System.out.println(sum(nums1, isEvenIndex1));
        System.out.println(sum(nums2, isEvenIndex2));

        // Task-2 Test Data
        String str1 = "Java";
        String str2 = "JavaScript";
        int n1 = 2;
        int n2 = 5;
        int n3 = 3;
        int n4 = 4;

        System.out.println("\nTask-2:");
        System.out.println(nthChars(str1, n1));
        System.out.println(nthChars(str2, n2));
        System.out.println(nthChars(str1, n3));
        System.out.println(nthChars("Hi", n4));

        // Task-3 Test Data
        String str3 = "Hello";
        String str4 = "Hi";
        String str5 = "halogen";
        String str6 = "hello";
        String str7 = "programming";
        String str8 = "gaming";
        String str9 = "CONVERSATION";
        String str10 = "voices rant on";

        System.out.println("\nTask-3:");
        System.out.println(canFormString(str3, str4));
        System.out.println(canFormString(str5, str6));
        System.out.println(canFormString(str7, str8));
        System.out.println(canFormString(str9, str10));

        // Task-4 Test Data
        String str11 = "Apple";
        String str12 = "Peach";
        String str13 = "listen";
        String str14 = "silent";
        String str15 = "astronomer";
        String str16 = "moon starer";
        String str17 = "CINEMA";
        String str18 = "iceman";

        System.out.println("\nTask-4:");
        System.out.println(isAnagram(str11, str12));
        System.out.println(isAnagram(str13, str14));
        System.out.println(isAnagram(str15, str16));
        System.out.println(isAnagram(str17, str18));
    }
}
