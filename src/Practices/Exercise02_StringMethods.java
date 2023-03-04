package Practices;

import utilities.ScannerHelper;

public class Exercise02_StringMethods {
    public static void main(String[] args) {
        String str = ScannerHelper.getString();
        if (str.length()<3) System.out.println("Length is less than 3");
        if (str.length()>=3)
            if (str.length()%2 != 0) System.out.println(str.charAt(str.length()/2));
        else System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
    }
}
