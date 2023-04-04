package mock02;

import utilities.ScannerHelper;

public class Practice04_Task02 {
    public static void main(String[] args) {
        int num = ScannerHelper.getNumber();

        do {
            num = ScannerHelper.getNumber();
        }
        while (num<10);
    }
}
