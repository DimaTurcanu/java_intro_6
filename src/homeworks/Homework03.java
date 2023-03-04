package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------TASK1-------------------------");

        System.out.println("Enter 2 numbers");

        int nr1 = input.nextInt();
        int nr2 = input.nextInt();

        System.out.println("The difference between numbers is = " + (Math.abs(nr1 - nr2)));

        System.out.println("-------------------TASK2-------------------------");

        System.out.println("Enter 5 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(num1, num2), Math.max(Math.max(num3, num4), num5)));

        System.out.println("Min value = " + Math.min(Math.min(num1, num2), Math.min(Math.min(num3, num4), num5)));

        System.out.println("-------------------TASK3-------------------------");

        int random1 = (int)(Math.random() * 51 +50);
        int random2 = (int)(Math.random() * 51 +50);
        int random3 = (int)(Math.random() * 51 +50);

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);

        System.out.println("The sum of the numbers is = " +(random1 + random2 + random3));

        System.out.println("-------------------TASK4-------------------------");

        double alex = 125, mike = 220, donation = 25.5;

        System.out.println("Alex’s money: " + (alex - donation));
        System.out.println("Mike’s money: " + (mike + donation));


        System.out.println("-------------------TASK5-------------------------");

        double bike = 390, savings = 15.60;

        System.out.println("David can save $390 and buy the bicycle in " + (int)(bike / savings) + " days.");


        System.out.println("-------------------TASK6-------------------------");

        String s1 = "5", s2 = "10";

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println("-Sum of " + s1 + " and "+ s2 +" is = " + (n1 + n2));
        System.out.println("-Product of " + s1 + " and "+ s2 +" is = " + (n1 * n2));
        System.out.println("-Division of " + s1 + " and "+ s2 +" is = " + (n1 / n2));
        System.out.println("-Subtraction of " + s1 + " and "+ s2 +" is = " + (n1 - n2));
        System.out.println("-Remainder of " + s1 + " and "+ s2 +" is = " + (n1 % n2));



        System.out.println("-------------------TASK7-------------------------");

        s1 = "200";
        s2 = "-50";
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);

        System.out.println("The greatest value is = " + Math.max(n1,n2));
        System.out.println("The smallest value is = " + Math.min(n1,n2));
        System.out.println("The average is = " + (n1 + n2)/2);
        System.out.println("The absolute difference is = " + (Math.abs(n1) + Math.abs(n2)));

        System.out.println("-------------------TASK8-------------------------");

        double quarter = .25, dime = .10, nickle = .05, penny = .01;
        double daily = 3 *quarter + dime + 2 * nickle + penny;

        System.out.println("You can save $24 in " + (int)(24 / daily) + " days.");
        System.out.println("You can save $168 in " + (int)(168 / daily) + " days.");
        System.out.println("After 5 months you will save: $" + daily * 30 * 5);

        System.out.println("-------------------TASK9-------------------------");

        double computer = 1250, saving = 62.5;

        System.out.println("It will take " + (int)(computer / saving) + " days for Jessie to buy the computer.");

        System.out.println("-------------------TASK10-------------------------");

        double car = 14265, option1 = 475.50, option2 = 951;

        System.out.println("Option 1 will take " + (int)(car / option1) + " months");
        System.out.println("Option 2 will take " + (int)(car / option2) + " months");

        System.out.println("-------------------TASK11-------------------------");

        System.out.println("Enter 2 numbers:");

        int nm1 = input.nextInt();
        int nm2 = input.nextInt();

        System.out.println((double)(nm1) / nm2);



        System.out.println("-------------------TASK12-------------------------");

        int randomA = (int) (Math.random() *101);
        int randomB = (int) (Math.random() *101);
        int randomC = (int) (Math.random() *101);

        if(randomA<=25) {
            System.out.println("False");
        } else if (randomB<=25) {
            System.out.println("False");
        } else if (randomC<=25) {
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }

        System.out.println(randomA+ " " + randomB+ " " + randomC);

        System.out.println("-------------------TASK13-------------------------");

        String day1 = "Monday";
        String day2 = "Tuesday";
        String day3 = "Wednesday";
        String day4 = "Thursday";
        String day5 = "Friday";
        String day6 = "Saturday";
        String day7 = "Sunday";

        System.out.println("Please enter a number from 1 to 7 both inclusive");

        int dayInput = input.nextInt();

        if (dayInput == 1) {
            System.out.println("The number entered returns " + day1);
        } else if (dayInput == 2) {
            System.out.println("The number entered returns " + day2);
        } else if (dayInput == 3) {
            System.out.println("The number entered returns " + day3);
        } else if (dayInput == 4) {
            System.out.println("The number entered returns " + day4);
        } else if (dayInput == 5) {
            System.out.println("The number entered returns " + day5);
        } else if (dayInput == 6) {
            System.out.println("The number entered returns " + day6);
        } else if (dayInput == 7) {
            System.out.println("The number entered returns " + day7);
        } else {
            System.out.println("The week has only 7 days, please choose a number form 1 to 7.");
        }

        System.out.println("-------------------TASK14-------------------------");

        System.out.println("Tell me your exam results?");

        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();

        if ((score1 + score2 +score3)/3 >= 70) {
            System.out.println("YOU PASSED!");
        }
        else {
            System.out.println("YOU FAILED!");
        }

        System.out.println("-------------------TASK15-------------------------");

        System.out.println("Please enter 3 numbers:");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if (number1 == number2 && number3 == number1 ) {
            System.out.println("TRIPLE MATCH");
        } else if (number1 == number2 || number1 == number3 || number2 == number3) {
            System.out.println("DOUBLE MATCH");
        } else {
            System.out.println("NO MATCH");
        }

    }
}
