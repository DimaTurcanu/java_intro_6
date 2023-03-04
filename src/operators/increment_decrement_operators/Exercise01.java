package operators.increment_decrement_operators;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner inputNr = new Scanner(System.in);


        System.out.println("What is your number?");
        int number = inputNr.nextInt();
        int index = 1;
        System.out.println(number + "*" + index + "=" + number * index++);
        System.out.println(number + "*" + index + "=" + number * index++);
        System.out.println(number + "*" + index + "=" + number * index++);
        System.out.println(number + "*" + index + "=" + number * index++);
        System.out.println(number + "*" + index + "=" + number * index++);
    }
}
