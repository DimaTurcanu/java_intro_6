package projects;

import java.util.Scanner;


public class Project02 {
    public static void main(String[] args) {

        System.out.println("------------TASK1------------");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        input.nextLine();

        System.out.println("The product of the numbers entered is = " + number1 * number2 * number3);

        System.out.println("------------TASK2------------");

        System.out.println("What is your first name?");
        String fName = input.next();
        input.nextLine();

        System.out.println("What is your last name");
        String lName = input.next();
        input.nextLine();

        System.out.println("What is your year of birth?");
        int birthYear = input.nextInt();
        input.nextLine();

        System.out.println(fName + " " + lName + "'s age is = " + (2023 - birthYear));

        /* second method
        import java.time.YearMonth;
        int year = YearMonth.now().getYear();
        System.out.println(year -birthYear);
         */

        System.out.println("------------TASK3------------");

        System.out.println("What is your full name?");
        String fullName = input.nextLine();

        System.out.println("What is your weight?");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.println(fullName + "'s weight is = " + weight * 2.205 + " lbs.");

        System.out.println("------------TASK4------------");

        System.out.println("What is your full name?");
        String student1 = input.nextLine();

        System.out.println("What is your age?");
        int age1 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        String student2 = input.nextLine();

        System.out.println("What is your age?");
        int age2 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        String student3 = input.nextLine();

        System.out.println("What is your age?");
        int age3 = input.nextInt();

        System.out.println(student1 + "'s age is " + age1);
        System.out.println(student2 + "'s age is " + age2);
        System.out.println(student3 + "'s age is " + age3);
        System.out.println("The average age is " + ((age1 + age2 + age3)/3));
        System.out.println("The eldest is " + Math.max(Math.max(age1 ,age2) , age3));
        System.out.println("The youngest is " + Math.min(Math.min(age1 , age2) ,age3));

    }
}
