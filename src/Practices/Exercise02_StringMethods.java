package Practices;

import utilities.ScannerHelper;

public class Exercise02_StringMethods {
    public static void main(String[] args) {
        String str = ScannerHelper.getString();


        if (str.length()<3) System.out.println("");
        if (str.toLowerCase().substring(0,2).contains("a"))
            System.out.println("a" + str.substring(2));
       else  if (str.toLowerCase().substring(0,2).contains("b"))
            System.out.println("b" + str.substring(2));
        System.out.println(str.substring(2));

    }
}
