package loops;

import utilities.ScannerHelper;

public class Exercise10_SumOfNumbersByUser {
    public static void main(String[] args) {
/*
        int num1 = ScannerHelper.getNumber();
        int num2 = ScannerHelper.getNumber();
        int num3 = ScannerHelper.getNumber();
        int num4 = ScannerHelper.getNumber();
        int num5 = ScannerHelper.getNumber();

        System.out.println(num1 + num2 + num3 + num4 + num5);


 */
        //for loop
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += ScannerHelper.getNumber();
        }
        System.out.println(sum);

        // while loop

        int start = 1;
        int sumWhile = 0;
        while (start <= 5){
            ScannerHelper.getNumber();
            start++;
        }
        System.out.println(sumWhile);
    }
}
