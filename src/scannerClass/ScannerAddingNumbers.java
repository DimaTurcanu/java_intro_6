package scannerClass;

import java.util.Scanner;

public class ScannerAddingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int nr1 = input.nextInt();

        System.out.println("Please enter number 2");
        int nr2 = input.nextInt();

        System.out.println("Please enter number 2");
        int nr3 = input.nextInt();
        System.out.println("The sum of the numbers you added is:" + (nr1 + nr2 + nr3));
    }
}
