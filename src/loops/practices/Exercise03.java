package loops.practices;

import utilities.ScannerHelper;

public class Exercise03 {
    public static void main(String[] args) {
        int num1 = ScannerHelper.getNumber();
        int num2 = ScannerHelper.getNumber();

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i!=5) System.out.println(i);
        }

    }
}
