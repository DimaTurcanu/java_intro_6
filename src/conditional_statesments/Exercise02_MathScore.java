package conditional_statesments;

import java.util.Scanner;

public class Exercise02_MathScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey David, please enter your math score.");
        int number = input.nextInt();
        if (number >= 60){
            System.out.println("Awesome! You passed!");
        }
        else {
            System.out.println("Sorry! you failed");
        }
    }
}
