package utilities;

public class MatchHelper {

    //Write a public static method named max() and returns the greatest number of 3 numbers
    /*
        return or void?                     ->   return
        static or non-static                -> static
        what is the name of the method      -> max()
        what it returns?                    ->  int
        Does it take arguments?             -> 3 int arguments
     */

    public static int max(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }

    public static int min(int num1, int num2, int num3){
        return Math.min(Math.min(num1, num2), num3);
    }

    //Write a public static method named sum() and returns the sum of 2 numbers

    public static int sum(int num1, int num2) {
        return (num1 + num2);
    }

    //Write a public static method named product() and returns the product of 2 numbers

    public static int product(int num1, int num2) {
        return (num1 * num2);
    }

    //Write a public static method named square() and returns the square of a number

    public static int squareNr(int num1) {
        return (num1 * num1);
    }


    }


