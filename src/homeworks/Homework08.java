package homeworks;

import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("\n============TASK1===============\n");

        System.out.println(countConsonants("hello"));
        System.out.println(countConsonants("JAVA"));
        System.out.println(countConsonants(""));

        System.out.println("\n============TASK2===============\n");

        System.out.println(Arrays.toString(wordArray("Java is fun, and interesting")));
        System.out.println(Arrays.toString(wordArray("Hello, nice to meet you!!”")));

        System.out.println("\n============TASK3===============\n");
        System.out.println(removeExtraSpaces("java  is    fun"));
        System.out.println(removeExtraSpaces("Hello,    nice to   meet     you!!"));
        System.out.println("\n============TASK4===============\n");
        System.out.println(count3OrLess("Hi, my name is John Doe"));
        System.out.println(count3OrLess("Hello gus"));
        System.out.println("\n============TASK5===============\n");
        System.out.println(isDateFormatValid("01/21/1999"));
        System.out.println(isDateFormatValid("1/20/1991"));
        System.out.println(isDateFormatValid("10/2/1999"));
        System.out.println("\n============TASK6===============\n");
        System.out.println(isEmailFormatValid("abc@gmail"));
        System.out.println(isEmailFormatValid("abc@gmail.co"));
        System.out.println(isEmailFormatValid("abc@g.co"));
    }

    public static int countConsonants(String str) {
        str = str.replaceAll("[aeiouAEIOU]", "");//removing all vowels from the string
        return str.length();
    }

    public static String[] wordArray(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");

        Matcher matcher = pattern.matcher(str);
        List<String> wordsList = new ArrayList<>();
        while (matcher.find()) {
            wordsList.add(matcher.group());
        }
        return wordsList.toArray(new String[0]);
    }

    public static String removeExtraSpaces(String str) {
        return str.replaceAll("\\s+", " ");

    }

    public static int count3OrLess(String str) {
        str = ScannerHelper.getString();
        if (!str.contains(" ")){
            if (str.length()>3)return 0;
            else return 1;
        }
        return str.split("\\b\\w{1,3}\\b").length;
    }

    public static boolean isDateFormatValid(String dateOfBirth) {
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        return dateOfBirth.matches(regex);
    }

    public static boolean isEmailFormatValid(String email) {

        String pattern = "^\\w{2,}@\\w{2,}\\.\\w{2,}$";
        // check if the email matches the pattern
        return email.matches(pattern);
    }
}