package arrays;

import utilities.ScannerHelper;

public class Exercise04_CountChars {
    public static void main(String[] args) {
        String str = ScannerHelper.getString();

        System.out.println("\n================First way==================\n");

        int letters = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))  letters++;
        }
        System.out.println(letters);

        System.out.println("\n================Second way==================\n");

        str = ScannerHelper.getString();
        letters = 0;
        char [] chars = str.toCharArray();
        for (char c : chars) {
            if (Character.isLetter(c)) letters++;
        }

        System.out.println(letters);

    }
}
