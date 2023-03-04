package conditional_statesments;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the day of the week all in lowercase");
        String day = input.nextLine();

        switch (day) {
            case "monday":
                System.out.println("1st day of the week");
                break;
            case "tuesday":
                System.out.println("2st day of the week");
                break;
            case "wednesday":
                System.out.println("3st day of the week");
                break;
            case "thursday":
                System.out.println("4st day of the week");
                break;
            case "friday":
                System.out.println("5st day of the week");
                break;
            case "saturday":
                System.out.println("6st day of the week");
                break;
            case "sunday":
                System.out.println("7st day of the week");
                break;
            default:
                System.out.println("ERROR!");

        }

    }
}
