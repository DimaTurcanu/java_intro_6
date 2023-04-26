package regex;

import java.util.regex.Pattern;

public class RemoveAll {
    public static void main(String[] args) {

        // count vowels without regex
        String str = "Axxple";
        int counter = 0;

        for (char c : str.toCharArray()) {
            if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' ||
                    Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'i' ||
                    Character.toLowerCase(c) == 'u') counter++;
        }
        System.out.println("The number of vowels is " + counter);

        // using regex

        str = str.replaceAll("[^aioueAEIOU]", "");
        System.out.println("The number of vowels is " + str.length());

        // phone number validation

        String phoneNrRegex = "[(]?[0-9]{3}[)]?-[0-9]{3}-[0-9]{4}";
        System.out.println(Pattern.matches(phoneNrRegex, "(123)-234-2345"));
        System.out.println((str.charAt(str.indexOf('x') + 1) == 'x'));


    }
}
