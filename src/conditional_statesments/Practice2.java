package conditional_statesments;

import java.util.Random;

public class Practice2 {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(100) + 1;

        if (num <= 25) {
            System.out.println("First\n1st half");
        } else if (num <= 50) {
            System.out.println("Second\n1st half");
        } else if (num <= 75) {
            System.out.println("Third\n2st half");
        } else   {
            System.out.println("Fourth\n2st half");

        }
        System.out.println(num);
    }
}