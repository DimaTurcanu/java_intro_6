package regex;

import utilities.ScannerHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {
    public static void main(String[] args) {
        String input = ScannerHelper.getString();
        int counter = 0;
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            counter++;
            System.out.println(matcher.group());
        }
        System.out.println("This sentence contains " + counter + " words.");

        Pattern pattern1 = Pattern.compile("[a-zA-Z0-9_-]{8,15}");
    }
}
