package mathClass;

public class Exercise01 {
    public static void main(String[] args) {
        //System.out.println("The random number * 5 = " + ((int)(Math.random() * 51))*5);
        /*
        int randomNumber = (int)(Math.random() * 51);
        int result = randomNumber * 5;
        //int randomNumber = (int)Math.round(Math.random() * 50);

        System.out.println("The random number * 5 = " + result);


        Requirement:
        Write a program that generates two random numbers
        between 1 and 10 (both 1 and 10 are included)

        Find the min number
        Find the max number
        Find the absolute difference of the numbers

        Expected result:
         Min number = {min}
         Max number = {max}
         Difference = {difference}


         int randomNumber = (int) Math.round(Math.random() * 10); 0 - 9 -> False
         int randomNumb = (int)(Math.random() * 11); 0 - 10             -> False
         int randomNumb = (int)(Math.random() * 10) + 1; 0 - 10 -> 1 - 11 -> False
         int random = (int) (Math.random() * 10 + 1);                   -> True
         */

        //double random1 = Math.round(Math.random() * 9) + 1;

        // 15 - 20
        /*
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);

        System.out.println("Min number = " + Math.min(random1, random2));
        System.out.println("Max number = " + Math.max(random1, random2));
        System.out.println("Difference = " + Math.abs(random1-random2));



        int num1 = (int)(Math.round(Math.random() * 50 + 50));
        System.out.println("The random number % 10 = " + num1 % 10);
        System.out.println(num1);


        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers");

        int nr1 = input.nextInt();
        int nr2 = input.nextInt();
        int nr3 = input.nextInt();
        int nr4 = input.nextInt();
        int nr5 = input.nextInt();

        System.out.println("Expected " + ((nr1 * 5) + (nr2 * 2) + (nr3 * 3) + (nr4 * 2) + (nr5 * 1)));


         */
        int a = 5, b = 3;
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);

        if (s1.length() + s2.length() == 1) System.out.println(a + b);
        else System.out.println(a);



    }
}
