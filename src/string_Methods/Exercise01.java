package string_Methods;

import utilities.ScannerHelper;

public class Exercise01 {
    public static void main(String[] args) {

        String str1 = ScannerHelper.getString();
        String str2 = ScannerHelper.getString();

        if (str1.equals(str2)) {
            System.out.println("These strings are equal");
        } else {
            System.out.println("These strings are not equal");
        }
    }
}