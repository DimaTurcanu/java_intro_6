package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("-------------------Task1------------------------");

        System.out.println(countWords("      Java is fun       "));
        System.out.println(countWords("Selenium is the   most common UI automation tool.   "));

        System.out.println("-------------------Task2------------------------");

        System.out.println(countA("TechGlobal is a QA bootcamp"));
        System.out.println(countA("QA stands for Quality Assurance"));

        System.out.println("-------------------Task3------------------------");

        System.out.println(countPos(new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67))));
        System.out.println(countPos(new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123))));

        System.out.println("-------------------Task4------------------------");

        System.out.println(removeDuplicateNumbers(new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60))));
        System.out.println(removeDuplicateNumbers(new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3))));

        System.out.println("-------------------Task5------------------------");

        System.out.println(removeDuplicateElements(new ArrayList<>(Arrays.asList("java", "C", "ruby", "JAVA", "ruby", "C#", "C++"))));
        System.out.println(removeDuplicateElements(new ArrayList<>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"))));

        System.out.println("-------------------Task6------------------------");
        System.out.println(removeExtraSpaces("  I   am      learning     Java     "));
        System.out.println(removeExtraSpaces("Java  is fun    "));
        System.out.println("-------------------Task7------------------------");
        System.out.println(Arrays.toString(add(new int[]{5, 6, 78, 4, 34, 4}, new int[]{3, 4, 5, 6, 7, 8, 5})));
        System.out.println(Arrays.toString(add(new int[]{5, 6, 78, 4, 34, 4}, new int[]{3, 8, 5})));
        System.out.println("-------------------Task8------------------------");
        System.out.println(findClosestTo10(new int[]{10, -13, 12, 15,8, -24}));


    }

    public static int countWords(String str) {
        return str.trim().replaceAll("\\s+", " ").split(" ").length;
    }

    public static int countA(String str) {
        return str.replaceAll("[^Aa]", "").length();
    }

    public static int countPos(ArrayList<Integer> list) {
        return (int) list.stream().filter(e -> e > 1).count();
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> singles = new ArrayList<>();

        for (Integer integer : list) {
            if (!singles.contains(integer)) singles.add(integer);
        }
        return singles;
    }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> list) {
        ArrayList<String> singles = new ArrayList<>();
        for (String s : list) {
            if (!singles.contains(s)) singles.add(s);
        }
        return singles;
    }

    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static int[] add(int[] arr1, int[] arr2) {
        int[] arr3 = new int[Math.max(arr1.length, arr2.length)];
        for (int i = 0; i < Math.max(arr1.length, arr2.length); i++) {
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr2[i] : 0;
            arr3[i] = val1 + val2;
    }return arr3;
}

    public static int findClosestTo10(int[] numbers){
        Arrays.sort(numbers);
        int closest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number != 10 && Math.abs(number - 10) < Math.abs(closest - 10)) {
                closest = number;
            }
        }
        return closest;
    }

}

