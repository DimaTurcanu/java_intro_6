package Practices;

import utilities.ScannerHelper;

public class Exercise05_StringMethods {
    public static void main(String[] args) {

        String str1 = ScannerHelper.getString();
        String str2 = ScannerHelper.getString();

        if (str1.length()<2 || str2.length()<2) System.out.println("INVALID INPUT");
        else System.out.println(str1.substring(1, str1.length() - 1) + str2.substring(1, str2.length() - 1));

        System.out.println(Math.min(str1.length() , str2.length()));

    }
}
