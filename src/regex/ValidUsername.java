package regex;

import utilities.ScannerHelper;

import java.util.regex.Pattern;

public class ValidUsername {
    public static void main(String[] args) {

        String input = ScannerHelper.getString();
        if (Pattern.matches("[a-zA-Z0-9]{5,10}", input)) System.out.println("Valid username");
        else System.out.println("Error!");


    }
}
