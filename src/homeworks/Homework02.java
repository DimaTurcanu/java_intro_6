package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {


        System.out.println("\n ----------------Task 1--------------------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int n1 = input.nextInt();

        System.out.println("Enter the second number");
        int n2 = input.nextInt();

        System.out.println("The number 1 entered by user is = " + n1);
        System.out.println("The number 2 entered by user is = " + n2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (n1+n2));

        System.out.println("\n ----------------Task 2--------------------\n");

        System.out.println("Enter the first number");
        int n3 = input.nextInt();

        System.out.println("Enter the second number");
        int n4 = input.nextInt();

        System.out.println("The product of the given 2 numbers is: " + n3*n4);

        System.out.println("\n ----------------Task 3--------------------\n");

        System.out.println("What is your first number?");
        double double1 = input.nextDouble();

        System.out.println("What is your second number?");
        double double2 = input.nextDouble();

        System.out.println("The sum of the given numbers is = " + (double1 + double2));
        System.out.println("The product of the given numbers is = " + double1 * double2);
        System.out.println("The subtraction of the given numbers is = " + (double1 - double2));
        System.out.println("The division of the given numbers is = " + double1 / double2);
        System.out.println("The remainder of the given numbers is = " + double1 % double2);



        System.out.println("\n ----------------Task 4--------------------\n");

        System.out.println("1. \t" + (-10 + 7 * 5));
        System.out.println("2. \t" + (72+24) % 24);
        System.out.println("3. \t" + (10 + -3*9 / 9));
        System.out.println("4. \t" + (5 + 18 / 3 * 3 - (6 % 3)));

        System.out.println("\n ----------------Task 5--------------------\n");

        System.out.println("What is your first number?");
        int number1 = input.nextInt();

        System.out.println("What is your second number?");
        int number2 = input.nextInt();

        System.out.println("The average of the given numbers is: " +(number1 + number2) / 2);

        System.out.println("\n ----------------Task 6--------------------\n");

        System.out.println("What is your first number?");
        int num1 = input.nextInt();

        System.out.println("What is your second number?");
        int num2 = input.nextInt();

        System.out.println("What is your third number?");
        int num3 = input.nextInt();

        System.out.println("What is your forth number?");
        int num4 = input.nextInt();

        System.out.println("What is your fifth number?");
        int num5 = input.nextInt();

        System.out.println("The average of the given numbers is: " +(num1 + num2 + num3 + num4 + num5) / 5);

        System.out.println("\n ----------------Task 7--------------------\n");

        System.out.println("What is your first number?");
        int number3 = input.nextInt();

        System.out.println("What is your second number?");
        int number4 = input.nextInt();

        System.out.println("What is your third number?");
        int number5 = input.nextInt();

        System.out.println("The " + number3 + " multiplied with " + number3 + " is = " + number3 * number3);
        System.out.println("The " + number4 + " multiplied with " + number4 + " is = " + number4 * number4);
        System.out.println("The " + number5 + " multiplied with " + number5 + " is = " + number5 * number5);


        System.out.println("\n ----------------Task 8--------------------\n");

        System.out.println("What is the measure of one of the side's square?");
        int side = input.nextInt();
        input.nextLine();

        System.out.println("Perimeter of the square = " + side * 4);
        System.out.println("Area of the square = " + side * side);

        System.out.println("\n ----------------Task 9--------------------\n");

        double salary = 90000;
        System.out.println("A Software Engineer in Test can earn $" + salary * 3 + " in 3\nyears");



        System.out.println("\n ----------------Task 10--------------------\n");

        System.out.println("What is your favorite book?");
        String book = input.nextLine();

        System.out.println("What is your favorite color?");
        String color = input.nextLine();

        System.out.println("What is your favorite number?");
        int number = input.nextInt();
        input.nextLine();

        System.out.println("User’s favorite book is: " + book);
        System.out.println("User’s favorite color is: " + color);
        System.out.println("User’s favorite number is: " + number);


        System.out.println("\n ----------------Task 11--------------------\n");

        System.out.println("Please enter your first name");
        String fName = input.nextLine();

        System.out.println("Please enter your last name");
        String lName = input.nextLine();

        System.out.println("Please enter your age");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your email address");
        String email = input.nextLine();

        System.out.println("Please enter your phone number");
        String phoneNum = input.nextLine();

        System.out.println("Please enter your address");
        String address = input.nextLine();

        System.out.println("\tUser who joined this program is " + fName + " " + lName + ". " + fName + "'s age is\n" +
                age + ". " + fName + "'s email address is " + email + ", phone number \nis " + phoneNum + ", and address is " +
                address + ".");


    }
}
