package homeworks;

import utilities.ScannerHelper;

public class Homework05 {
    public static void main(String[] args) {
        System.out.println("\n--------------------TASK-1----------------------\n");

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) System.out.print(i + " - ");

    }

        System.out.println("\n--------------------TASK-2----------------------\n");

        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) System.out.print(i + " - ");

        }

        System.out.println("\n--------------------TASK-3----------------------\n");

        String solution = "";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) solution += i + " - ";
        }
        System.out.println(solution.substring(0,solution.length()-3));

        System.out.println("\n--------------------TASK-4----------------------\n");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i*i);
        }

        System.out.println("\n--------------------TASK-5----------------------\n");

        int totalSum = 0;

        for (int i = 1; i <= 10; i++) {
            totalSum += i;
        }
        System.out.println(totalSum);

        System.out.println("\n--------------------TASK-6----------------------\n");

        int userNumber = ScannerHelper.getNumber();
        int factorial = 1;
        for (int i = 1; i <= userNumber; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        System.out.println("\n--------------------TASK-7----------------------\n");

        String fullName = ScannerHelper.getName().toLowerCase();

        int vowel = 0;

        for (int i = 0; i <= fullName.length()-1; i++) {
            if (fullName.charAt(i) == 'a' || fullName.charAt(i) == 'e' || fullName.charAt(i) == 'o' || fullName.charAt(i) == 'u' || fullName.charAt(i) == 'i')
                vowel++;
        }
        System.out.println("There are " + vowel + " vowel letters in this full name");


        System.out.println("\n--------------------TASK-8----------------------\n");

        String name;
        do {
            name = ScannerHelper.getFirstName();
        }
        while (name.toLowerCase().charAt(0) != 'j');
        System.out.println("End of the program");
    }

}
