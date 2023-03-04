package conditional_statesments;

import java.util.Scanner;

public class Exercise04_RetirementAge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age:");

        int age = input.nextInt();

        if (age >= 55) {
            System.out.println("It is your time to get retired!");
        } else {
            int ageLeft = 55 - age;

            if (ageLeft == 1) {
                System.out.println("You have 1 year to get retired");
            } else {
                System.out.println("You have " + ageLeft + " to get retired");
            }
        }
    }

}