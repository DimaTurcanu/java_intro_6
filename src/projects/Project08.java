package projects;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Project08 {
    public static void main(String[] args) {
        System.out.println("\n============TASK1==============\n");
        System.out.println(findClosestDistance(new int[]{4}));
        System.out.println(findClosestDistance(new int[]{4, 8, 7, 15}));
        System.out.println(findClosestDistance(new int[]{10, -5, 20, 50, 100}));
        System.out.println("\n============TASK2==============\n");
        System.out.println(findSingleNumber(new int[]{5, 3, -1, 3, 5, 4, 6, 6, 6, 8 , 9 , 8, 9, -1}));
        System.out.println(findSingleNumber(new int[]{2}));
        System.out.println("\n============TASK3==============\n");
        System.out.println(findFirstUniqueCharacter("Hello"));
        System.out.println(findFirstUniqueCharacter("abc d abc "));
        System.out.println(findFirstUniqueCharacter("abab"));
        System.out.println("\n============TASK4==============\n");
        System.out.println(findMissingNumber(new int[]{2, 4}));
        System.out.println(findMissingNumber(new int[]{2, 3, 1, 5}));
        System.out.println(findMissingNumber(new int[]{4, 7, 8, 6}));
    }

    public static int  findClosestDistance(int [] arr){
        sort(arr);
        if (arr.length<2) return -1;
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length -1; i++) {
            int abs = (arr[i+1] - arr[(i)]);
            if(abs<minAbs) minAbs = abs;
        }return minAbs;
    }
    public static int  findSingleNumber(int [] arr) {
        Arrays.sort(arr);
        int single = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count == 0) {
                    single = arr[i - 1];
                    break;
                }
                count = 0;
            }
        }
        if (count == 0 && single == 0) {
            single = arr[arr.length - 1];
        }
        return single;
    }
    public static char findFirstUniqueCharacter(String str){

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the current character only appears once in the string
            if (str.indexOf(c) == i && str.lastIndexOf(c) == i) {
                return c; // Return the first unique character found
            }
        }
        return '\0';
    }
    public static int  findMissingNumber(int [] arr){

        sort(arr);
        int missingNumber = 0;
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i+1] - arr [i] > 1) missingNumber = arr[i]+1;
        } return missingNumber;
    }
}
