package mock02;

import utilities.ScannerHelper;

public class Practice04_Task03 {
    public static void main(String[] args) {
        int num1 = ScannerHelper.getNumber();
        int num2 = ScannerHelper.getNumber();

        for (int i = Math.min(num1, num2); i <= Math.max(num2, num1); i++) {
            if (i != 5) System.out.println(i);
        }

    }
}
