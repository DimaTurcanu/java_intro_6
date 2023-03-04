package projects;

import java.util.Random;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("--------------------TASK1-------------------------");
        /*
        TASK-1
        -Assume that you are given below Strings
        String s1 = “24”, s2 = “5”;
        -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
        The sum of 24 and 5 = 29
        The subtraction of 24 and 5 = 19
        The division of 24 and 5 = 4.8
        The multiplication of 24 and 5 = 120
        The remainder of 24 and 5 = 4
         */

        String s1 = "24", s2 = "5";
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        System.out.println("The sum of " + num1 + " and " + num2 + " = " + (num1 + num2));
        System.out.println("The subtraction of " + num1 + " and " + num2 + " = " + (num1 - num2));
        System.out.println("The division of " + num1 + " and " + num2 + " = " + ((double) num1 / num2));
        System.out.println("The multiplication of " + num1 + " and " + num2 + " = " + num1 * num2);
        System.out.println("The remainder of " + num1 + " and " + num2 + " = " + num1 % num2);


        System.out.println("--------------------TASK2-------------------------");

        /*
        TASK-2
        -Write a program that generates a random number between 1 to 35 (1 and 35 are
        included)
        -Find if the given number is a Prime Number
        -If random number generated is a prime one, then print “{NUMBER} IS A PRIME
        NUMBER”.
        -Otherwise, print “{NUMBER} IS NOT A PRIME NUMBER”
        Prime number is a number that can be divided only by itself and 1. It cannot be
        divided by any other number. The smallest prime number is 2 and 2 is the only
        even prime number.
        So, from this definition, prime numbers between 1 and 35 are: 2, 3, 5, 7, 11, 13, 17,
        19, 23, 29, 31
        */

        Random random = new Random();
        int newR = random.nextInt(35) + 1;

        if (newR == 2 || newR == 3 || newR == 5 || newR == 7 || newR == 11 || newR == 13 || newR == 17 || newR == 19 ||
                newR == 23 || newR == 29 || newR == 31) System.out.println(newR + " IS A PRIME NUMBER.");
        else System.out.println(newR + " IS NOT A PRIME NUMBER.");


        System.out.println("--------------------TASK3-------------------------");

        /*
        TASK-3
        -Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are
        included)
        -Find and print each number in an ascending order
        -Ascending order is ordering from lowest to greatest
        NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this
        task.
        Test data: Assume below numbers are generated
        Random number 1 = 43
        Random number 2 = 7
        Random number 3 = 30
        Expected result:
        Lowest number is = 7
        Middle number is = 30
        Greatest number is = 43
         */

        Random random2 = new Random();
        int newRandom1 = random2.nextInt(49) + 1;
        int newRandom2 = random2.nextInt(49) + 1;
        int newRandom3 = random2.nextInt(49) + 1;

        if (newRandom1 > newRandom2 && newRandom1 > newRandom3) {
            if (newRandom2 > newRandom3)
                System.out.println("Random number 1 = " + newRandom1 + "\nRandom number 2 = " +
                        newRandom2 + "\nRandom number 3 = " + newRandom3);
            else System.out.println("Random number 1 = " + newRandom1 + "\nRandom number 2 = " +
                    newRandom3 + "\nRandom number 3 = " + newRandom2);
        } else if (newRandom2 > newRandom1 && newRandom2 > newRandom3)
            if (newRandom1 > newRandom3)
                System.out.println("Random number 1 = " + newRandom2 + "\nRandom number 2 = " +
                        newRandom1 + "\nRandom number 3 = " + newRandom3);
            else System.out.println("Random number 1 = " + newRandom2 + "\nRandom number 2 = " +
                    newRandom3 + "\nRandom number 3 = " + newRandom1);
        else if (newRandom1 > newRandom2)
            System.out.println("Random number 1 = " + newRandom3 + "\nRandom number 2 = " +
                    newRandom1 + "\nRandom number 3 = " + newRandom2);
        else System.out.println("Random number 1 = " + newRandom3 + "\nRandom number 2 = " +
                    newRandom2 + "\nRandom number 3 = " + newRandom1);


        System.out.println("--------------------TASK4-------------------------");

        /*
        TASK-4 (Find if given char is lowercase or uppercase)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If the given char is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out if it is an uppercase or a lowercase letter.
        -If the letter is uppercase, then print “The letter is uppercase”, else print “The
        letter is lowercase”.
         */

        char c1 = 33;
        if ((c1 >= 65 && c1 <= 90) || c1 >= 97 && c1 <= 122)
            System.out.println("Character is a letter");
        else if (c1 >= 48 && c1 <= 57) {
            System.out.println("Character is a digit");
        } else System.out.println("Invalid character detected!!!");


        System.out.println("--------------------TASK5-------------------------");

        /*
        TASK-5 (Find if given char is vowel or consonant)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If it is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out whether it is a vowel or a consonant.
        -If the letter is vowel, then print “The letter is vowel”, else print “The letter is
        consonant”.
        -Vowel letters: a, e, i o, u, A, E, I, O, U
         */

        char c2 = 66;
        if ((c2 >= 65 && c2 <= 90) || c2 >= 92 && c2 <= 122) {
            if (c2 == 65 || c2 == 69 || c2 == 73 || c2 == 79 || c2 == 85 || c2 == 97 || c2 == 101 || c2 == 105 || c2 == 111 || c2 == 117)
                System.out.println("The letter is vowel");
            else System.out.println("The letter is consonant");
        } else System.out.println("Not a character");


        System.out.println("--------------------TASK6-------------------------");
        /*
        TASK-6 (Find if given char is special character or not)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if the given char is a special character but not a digit or not a letter.
        -If it is not a special character, then print “Invalid character detected!!!”.
        -If it is a special character, then print “Special character is =
        {givenCharacter}”.
         */

        char c3 = '$';
        if ((c3 >= 32 && c3 <= 47) || (c3 >= 58 && c3 <= 64) || (c3 >= 91 && c3 <= 96) || (c3 >= 123 && c3 <= 126))
            System.out.println("Special character is = " + c3);
        else System.out.println("Invalid character detected!!!");

        System.out.println("--------------------TASK7-------------------------");

        /*
        TASK-7 (Find if given char is a letter or digit or special character)
        -Assume you are given a single character. (It will be hard-coded)
        -If given char is a letter, then print “Character is a letter”
        -If given char is a digit, then print “Character is a digit”
        -Otherwise, print “Character is a special character”
         */

        char c4 = 555;
        if ((c4 >= 65 && c4 <= 90) || c4 >= 97 && c4 <= 122)
            System.out.println("Character is a letter");
         else if (c4 >= 48 && c4 <= 57)
            System.out.println("Character is a digit");
            else if ((c4 >= 32 && c4 <= 47) || (c4 >= 58 && c4 <= 64) || (c4 >= 91 && c4 <= 96) || (c4 >= 123 && c4 <= 126))
                System.out.println("Character is a special character");
            else System.out.println("Invalid character detected!!!");

    }
}
