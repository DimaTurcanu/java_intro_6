import java.util.Scanner;

public class ScannerFirstAndLastName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName, lastName, address;

        System.out.println("Please enter your first name?");
        firstName = input.next();

        System.out.println("Please enter your last name?");
        lastName = input.next();
        System.out.println("Please enter your address: ");
        input.nextLine();
        address = input.nextLine();

        System.out.println("The user full name is: " + firstName + " " + lastName);
        System.out.println("Adress: " + address);


    }
}