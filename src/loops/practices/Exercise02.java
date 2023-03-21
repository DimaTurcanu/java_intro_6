package loops.practices;

import utilities.ScannerHelper;

public class Exercise02 {
    public static void main(String[] args) {
        int num;
        do {
           num = ScannerHelper.getNumber();
           if (num<10) System.out.println("This number is not more than or equals 10");

        }
        while (num<10);
        System.out.println("This number is more than or equals 10");

    }
}
