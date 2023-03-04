package Practices;

import utilities.ScannerHelper;

public class Exercise04_StringMethods {
    public static void main(String[] args) {

        System.out.println("-=-=-=-=-=-=-=-=-=Task1-=-=-=-=-=-=-=-=-=-=");

        String str = ScannerHelper.getString();
        if (str.length()<2) System.out.println("Length is less than 2");
        else System.out.println(str.substring(0, 2).equals(str.substring(str.length() - 2)));


    }
}
