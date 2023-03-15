package character_class;

import utilities.ScannerHelper;

public class CountCharacters {
    public static void main(String[] args) {

        String str = ScannerHelper.getString();

        System.out.println("-----------------TASK-1------------------------");

        int letters = 0;
        int digits = 0;


        for (int i = 0; i <= str.length()-1; i++) {
            if (Character.isLetter(str.charAt(i))) letters ++;
            else if (Character.isDigit(str.charAt(i))) digits++;

        }
        System.out.println("Digits are " + digits);
        System.out.println("Letters are " + letters);



        System.out.println("-----------------TASK-2------------------------");

        int up = 0;
        int lower = 0;


        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isUpperCase(str.charAt(i))) up++;
            else if (Character.isLowerCase(str.charAt(i))) lower++;

        }
        System.out.println("This string has " + up + " uppercase letters and " + lower + " lowercase letters");

        System.out.println("-----------------TASK-3------------------------");

        int special = 0;


        for (int i = 0; i <= str.length() - 1; i++) {
            if (!Character.isLetterOrDigit(str.charAt(i)) || !(Character.isSpaceChar(str.charAt(0)))) special++;

        }
        System.out.println("special char are " + special);

        System.out.println("-----------------TASK-3------------------------");
        int spaces = 0;

        for (int i = 0; i <= str.length() - 1; i++) {

                if (Character.isUpperCase(str.charAt(i))){ up++; letters++;}
                else if (Character.isLowerCase(str.charAt(i))){ lower++; letters++;}

           else  if (Character.isDigit(str.charAt(i))) digits++;
           else  if (Character.isSpaceChar(str.charAt(0))) spaces++;
           else special++;


        }
        System.out.println("Letters = " + letters + "\n Uppercase letter = " + up + "\nLowercase letters = " + lower +
                "\nDigits = " + digits + "\nSpaces = " + spaces + "\nSpecial = " + special);
    }
}
