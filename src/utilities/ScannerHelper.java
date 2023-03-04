package utilities;

import java.util.Scanner;

public class ScannerHelper {
    static Scanner input = new Scanner(System.in);

    // Write a method that ask and return a first name from user
    public static String getFirstName() {
        System.out.println("Please enter your first name.");
        return input.nextLine();
        }
    public static String getLastName(){
        System.out.println("Please enter your last name.");
        return input.nextLine();
    }
    public static int getAge() {
        System.out.println("Please enter your age.");
        int age = input.nextInt();
        input.nextLine();
        return age;
    }
    public static int getNumber() {
        System.out.println("Please enter a number.");
        int number = input.nextInt();
        input.nextLine();
        return number;
    }
    public static String getString() {
        System.out.println("Please enter a String");
        String str = input.nextLine();
        return str;
    }
    public static String getAddress() {
        System.out.println("Please enter your full address");
        String str = input.nextLine();
        return str;
    }
    public static String getfavCountry() {
        System.out.println("Please enter your favorite country");
        String str = input.nextLine();
        return str;
    }

}