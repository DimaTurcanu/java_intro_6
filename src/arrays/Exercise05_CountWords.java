package arrays;

import utilities.ScannerHelper;

public class Exercise05_CountWords {
    public static void main(String[] args) {

        String str = ScannerHelper.getString();

        String [] arrays = str.split(" ");

        int actualWords = 0;
        for (String array : arrays) {
            if (!str.isEmpty()) actualWords++;
        }

        System.out.println("The number of words is " + actualWords); // 2);
    }
}
