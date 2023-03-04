package conditional_statesments;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 6");
        int num = input.nextInt();


        switch (num) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                System.out.println("mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("Jun");

        }
    }
}
