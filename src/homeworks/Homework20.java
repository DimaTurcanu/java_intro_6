package homeworks;

public class Homework20 {

    public static int sum(int[] arr, boolean isEven) {
        int count = 0;
        for (int num : arr) {
            if (isEven && num % 2 == 0) {
                count++;
            } else if (!isEven && num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumDigitsDouble(String input) {
        int sum = 0;
        boolean foundDigit = false;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
                foundDigit = true;
            }
        }
        return foundDigit ? sum * 2 : -1;
    }

    public static int countOccurrence(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        int count = 0;
        int index = -1;


        while ((index = str1.indexOf(str2, index + 1)) != -1) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Test Task-1\n");
        int[] arr1 = {1, 5, 10};
        System.out.println(sum(arr1, true));

        int[] arr2 = {3, 7, 2, 5, 10};
        System.out.println(sum(arr2, false));

        System.out.println("\nTest Task-2\n");
        System.out.println(sumDigitsDouble("Java"));
        System.out.println(sumDigitsDouble("ab12"));
        System.out.println(sumDigitsDouble("23abc45"));
        System.out.println(sumDigitsDouble("Hi-23"));

        System.out.println("\nTest Task-3");
        System.out.println(countOccurrence("Hello", "World"));
        System.out.println(countOccurrence("Hello", "l"));
        System.out.println(countOccurrence("Can I can a can", "anc"));
        System.out.println(countOccurrence("IT conversations", "IT"));
    }
}
