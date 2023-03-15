package character_class;

import utilities.ScannerHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {


        String str = ScannerHelper.getString();

        System.out.println(str.charAt(0)>=65 && str.charAt(0)<=90);

        char firstChar = str.charAt(0);

        System.out.println(Character.isLowerCase(firstChar));
        System.out.println(Character.isUpperCase(firstChar));
        System.out.println(Character.isLetter(firstChar));
        System.out.println(Character.isLetterOrDigit(firstChar));
        System.out.println(Character.isDigit(firstChar));
        System.out.println(Character.isSpaceChar(firstChar));
        System.out.println(Character.isWhitespace(firstChar));

    }
    }