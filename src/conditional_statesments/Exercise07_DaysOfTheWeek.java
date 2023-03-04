package conditional_statesments;

import java.util.Random;

public class Exercise07_DaysOfTheWeek {
    public static void main(String[] args) {

        Random r = new Random();

        int number = r.nextInt(7);
        if (number == 0) {
            System.out.println("Sunday");
        } else if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }
        /* System.out.println(number);

        if(number == 0) System.out.println("Sunday");
        else if(number == 1) System.out.println("Monday");
        else if(number == 2) System.out.println("Tuesday");
        else if(number == 3) System.out.println("Wednesday");
        else if(number == 4) System.out.println("Thursday");
        else if(number == 5) System.out.println("Friday");
        else System.out.println("Saturday");

         */

        switch (number) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");


        }
    }
}