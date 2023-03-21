package loops.practices;

import utilities.ScannerHelper;

public class Exercise04 {
    public static void main(String[] args) {
        String str = ScannerHelper.getString().toLowerCase();
        int vowels = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i')
                vowels++;
        }
        System.out.println("There are " + vowels + " vowels");
    }
}
