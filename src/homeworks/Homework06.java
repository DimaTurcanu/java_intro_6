package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        /*
        -Create an int array having size of 10
        -Assign 23 to index of 2
        -Assign 12 to index of 4
        -Assign 34 to index of 7
        -Assign 7 to index of 9
        -Assign 15 to index of 6
        -Assign 89 to index of 0
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 9
        -Print the entire array
        Expected Result:
        0
        89
        7
        [89, 0, 23, 0, 12, 0, 15, 34, 0, 7]
         */
        System.out.println("\n=======================TASK1==========================\n");

        int [] numbers = new int[10];
        numbers[2] = 23; numbers[4] = 12; numbers[7] = 34;
        numbers[9] = 7; numbers[6] = 15; numbers[0]= 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n=======================TASK2==========================\n");

        /*
        Requirement:
        -Create a String array having size of 5
        -Assign “abc” to index of 1
        -Assign “xyz” to index of 4
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 4
        -Print the entire array
        Expected Result:
        null
        null
        xyz
        [null, abc, null, null, xyz]
         */

        String [] strings = new String[5];
        strings[1] = "abc";
        strings[4] = "xyz";

        System.out.println(strings[3]);
        System.out.println(strings[0]);
        System.out.println(strings[4]);
        System.out.println(Arrays.toString(strings));

        System.out.println("\n=======================TASK3==========================\n");

        /*
        Requirement:
        -Create an int array that stores numbers below
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire array
        -Print the entire array sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
         */

        int[] arrays = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));


        System.out.println("\n=======================TASK4==========================\n");

        /*
        Requirement:
        -Create a String array that stores countries below
        Germany, Argentina, Ukraine, Romania
        THEN:
        -Print the entire array
        -Print the entire array sorted lexicographically
        Expected Result:
        [Germany, Argentina, Ukraine, Romania]
        [Argentina, Germany, Romania, Ukraine]
         */

        String [] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n=======================TASK5==========================\n");

        /*
        Requirement:
        -Create a String array that stores cartoon dogs below
        Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky
        THEN:
        -Print the entire array
        -Then, check if it contains Pluto
        if it contains Pluto, then print true
        if it does not contain Pluto, print false
        Expected Result:
        [Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky]
        true
         */

        String [] dogCartoons = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogCartoons));
        boolean exists = false;
        for (String dogCartoon : dogCartoons) {
            if (dogCartoon.equals("Pluto")) exists = true;
        }
        System.out.println(exists);

        System.out.println("\n=======================TASK6==========================\n");

        /*
        Requirement:
        -Create a String array that stores cartoon cats
        below
        Garfield, Tom, Sylvester, Azrael
        THEN:
        -Print the entire array sorted lexicographically
        -Then, check if it contains Garfield and Felix
        if it contains both, then print true
        if it does not contain both, print false
        Expected Result:
        [Azrael, Garfield, Sylvester, Tom]
        false
         */

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        boolean first = false;
        boolean second = false;

        for (String cartoonCat : cartoonCats) {
            if (cartoonCat.equals("Garfield")) first = true;
            if (cartoonCat.equals("Felix")) second = true;
        }
        System.out.println(first&&second);

        System.out.println("\n=======================TASK7==========================\n");

        /*
        -Create a double array that stores numbers below
        10.5, 20.75, 70, 80, 15.75
        THEN:
        -Print the entire array
        -Print each element
        Expected Result:
        [10.5, 20.75, 70.0, 80.0, 15.75]
        10.5
        20.75
        70.0
        80.0
        15.75
         */

        double[] doubles = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(doubles));

        for (double aDouble : doubles) {
            System.out.println(aDouble);
        }

        System.out.println("\n=======================TASK8==========================\n");

        /*
        Requirement:
        -Create a char array that stores characters below
        A, b, G, H, 7, 5, &, *, e, @, 4
        THEN:
        -Print the entire array
        -Print the total count of the letters
        -Print the total count of lowercase letters
        -Print the total count of uppercase letters
        -Print the total count of digits
        -Print the total count of special characters
        Expected Result:
        [A, b, G, H, 7, 5, &, *, e, @, 4]
        Letters = 5
        Uppercase letters = 3
        Lowercase letters = 2
        Digits = 3
        Special characters = 3
         */

        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(chars));


        int letters = 0;
        int lCase = 0;
        int upCase = 0;
        int digits = 0;
        int specialC = 0;

        for (char aChar : chars) {
            if (Character.isLetter(aChar)) letters++;
            if (Character.isLowerCase(aChar)) lCase++;
            if (Character.isUpperCase(aChar)) upCase++;
            if (Character.isDigit(aChar)) digits++;
            if (!Character.isLetterOrDigit(aChar)) specialC++;

        }
        System.out.println("Letters = " + letters);
        System.out.println("Uppercase letters = " + upCase);
        System.out.println("Lowercase letters = " + lCase);
        System.out.println("Digits = " +digits);
        System.out.println("Special characters = " + specialC);

        System.out.println("\n=======================TASK9==========================\n");

        /*
        -Create a String array that stores objects below
        Pen, notebook, Book, paper, bag, pencil, Ruler
        THEN:
        -Print the entire array
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements starts with B or P, ignoring cases
        -Print how many elements has “book” or “pen” in it, ignoring
        cases
        Expected Result:
        [Pen, notebook, Book, paper, bag, pencil, Ruler]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 4
        Elements starting with B or P = 5
        Elements having ”book” or “pen”= 4
         */
        System.out.println("\n=======================TASK10==========================\n");

        /*
        Requirement:
        -Create an int array that stores numbers below
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        THEN:
        -Print the entire array
        -Print how many elements are more than 10
        -Print how many elements are less than 10
        -Print how many elements are 10
        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that are more than 10 = 5
        Elements that are less than 10 = 4
        Elements that are 10 = 2
         */
        System.out.println("\n=======================TASK11==========================\n");
        /*
        Requirement:
        -Create 2 int arrays that stores numbers below
        First -> 5, 8, 13, 1, 2
        Second -> 9, 3, 67, 1, 0
        THEN:
        -Print both arrays
        –Then, create a new array that will take greatest
        of same index from first 2 arrays
        -Print third array as well
        Expected Result:
        1st array is =  [5, 8, 13, 1, 2]
        2nd array is = [9, 3, 67, 1, 0]
        3rd array is =  [9, 8, 67, 1, 2]
         */
    }
}
