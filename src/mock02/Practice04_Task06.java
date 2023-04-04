package mock02;

import utilities.ScannerHelper;

public class Practice04_Task06 {
    public static void main(String[] args) {


        int num = 0;
        int counter = 0;
        do {

            num += ScannerHelper.getNumber();
             if (num < 100)
                 counter++;

        } while (num<100);
        if (counter>0) System.out.println("Sum of the entered numbers is at least 100");
        else System.out.println("This number is more than 100");

    }
}
