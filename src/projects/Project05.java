package projects;

import utilities.RandomGenerator;
import utilities.ScannerHelper;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\n---------------Task-1----------------\n");

        /*
        Write a program that asks user to enter a sentence as a String, and count
        how many words that sentence has, and print it with given below message.
        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 2 words at least. If not, then just
        print “This sentence does not have multiple words”.
        Test data 1:
        Hi
        Expected output 1:
        This sentence does not have multiple words.
        Test data 2:
        Java is fun
        Expected output 2:
        This sentence has 3 words.
        Test data 3:
        Hello World
        Expected output 3:
         */

        String str = ScannerHelper.getString();
        int words = 1;

         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == ' ') words++;
         }
             if (str.contains(" ")) System.out.println("This sentence has " + words + " words.");
             else {
                 System.out.println("This sentence does not have multiple words");
             }


        System.out.println("\n---------------Task-2----------------\n");

        int num1 = RandomGenerator.getRandomNumber(0,25);
        int num2 = RandomGenerator.getRandomNumber(0,25);

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i%5!=0) System.out.println(i);
        }


        System.out.println("\n---------------Task-3----------------\n");

        String sentence = ScannerHelper.getString();

        int containsA = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.toLowerCase().charAt(i)=='a') containsA++;
        }
        if (sentence.toLowerCase().contains("a")) System.out.println("This sentence has " + containsA + " a or A letters.");
        else System.out.println("This sentence does not have any A or a characters.");

        System.out.println("\n---------------Task-4----------------\n");

        String word = ScannerHelper.getString();
        String reverse = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse += word.charAt(i);
        }
        if (reverse.equals(word)) System.out.println("This word is palindrome");
        else System.out.println("This word not is palindrome");


        System.out.println("\n---------------Task-5----------------\n");

        /*
        Write a program that prints the below shape.
               *                  // 15
                      * * *       // 22
             * * * * *            // 13
          * * * * * * *           // 10
         * * * * * * * * *        // 9
          * * * * * * * * * * *   // 10
       * * * * * * * * * * * * *  // 7
   * * * * * * * * * * * * * * *  // 3
* * * * * * * * * * * * * * * * * //0
         */

        int rows = 8;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

