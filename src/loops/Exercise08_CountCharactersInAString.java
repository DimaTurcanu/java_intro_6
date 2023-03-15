package loops;

import utilities.ScannerHelper;

public class Exercise08_CountCharactersInAString {
    public static void main(String[] args) {

        String str = ScannerHelper.getString();
        int count = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            if ( str.toLowerCase().charAt(i) == 'a') count++;
        }
        System.out.println(count);
    }
}
