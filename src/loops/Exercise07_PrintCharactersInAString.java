package loops;

import utilities.ScannerHelper;

public class Exercise07_PrintCharactersInAString {
    public static void main(String[] args) {

        String str = ScannerHelper.getString();

        for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }

    }
}
