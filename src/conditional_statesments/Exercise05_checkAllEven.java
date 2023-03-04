package conditional_statesments;

import java.util.Scanner;

public class Exercise05_checkAllEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers:");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if (n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
