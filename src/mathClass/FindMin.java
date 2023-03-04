package mathClass;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int num1 = inputReader.nextInt(), num2 = inputReader.nextInt(), num3 = inputReader.nextInt();

        System.out.println(" The minim of " + num1+ ", " + num2 + ", " + num3 + " is : " + Math.min(Math.min(num1, num2), num3));
    }
}
