package loops;

import utilities.ScannerHelper;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
        int i = ScannerHelper.getNumber();
        for (int j = 0; j <= i; j++) {
            if ( j % 2 == 1) System.out.println(j);
        }
    }
}
