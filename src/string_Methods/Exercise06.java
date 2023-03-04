package string_Methods;

import utilities.ScannerHelper;

public class Exercise06 {
    public static void main(String[] args) {
        String str1 = ScannerHelper.getString();
        System.out.println(str1.startsWith("a") == str1.endsWith("e"));

    }
}
