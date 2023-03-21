package loops.practices;

import utilities.ScannerHelper;

public class Exercise06 {
    public static void main(String[] args) {
        int number = 0;

        int i = 0;

        do {
            number += ScannerHelper.getNumber();
            i++;
        } while (number < 100);

        if (i>1) System.out.println("This sum is already more than or equal to 100");
        else System.out.println("This number is already 100 ore more");
    }
}
