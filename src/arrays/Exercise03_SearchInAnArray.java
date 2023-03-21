package arrays;

import java.util.Arrays;

public class Exercise03_SearchInAnArray {
    public static void main(String[] args) {

        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        /*
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise

        RESULT:
        true
        */

        boolean exist = false;
        for (String object : objects) {
            if (object.equals("Mouse")) exist=true;
        }
        System.out.println(exist);

        // binary search

        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects, "Mouse") >=0);
        }
    }
