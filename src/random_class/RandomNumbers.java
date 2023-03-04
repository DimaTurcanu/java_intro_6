package random_class;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random myRandom = new Random();

        int num1 = myRandom.nextInt(4) +49;
        int num2 = myRandom.nextInt(4) + 49;

        System.out.println(num1);
        System.out.println(num2);
    }
}
