package Practices;

import utilities.ScannerHelper;

public class Exercise06_StringMethods {
    public static void main(String[] args) {

        String str = ScannerHelper.getString();
        if (str.length()<4) System.out.println("INVALID INPUT");
        System.out.println(str.substring(0, 2).equals("xx") && (str.substring(str.length() - 2).equals("xx")));
        System.out.println(str.startsWith("xx") && str.endsWith("xx"));
    }
}
