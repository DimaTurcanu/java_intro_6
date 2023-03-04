package scannerClass;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Please enter your first name?");
        String firstName = input.next();
        input.nextLine();

        System.out.println("Please enter your address?");
        String address = input.nextLine();


        System.out.println("Please enter your favorite number: ");
        int favNumber = input.nextInt();

        System.out.println(firstName + " address is " + address + " and their favorite number is " + favNumber );

    }
}
