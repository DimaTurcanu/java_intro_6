package mock02;

import java.util.Random;

public class Practice01_Task01 {
    public static void main(String[] args) {

        int random1 = new Random().nextInt(10) + 1;
        int random2 = new Random().nextInt(10) + 1;

        System.out.println("Min number = " + Math.min(random1, random2));
        System.out.println("Max number = " + Math.max(random1, random2));
        System.out.println("Difference = " + Math.abs(random1 - random2));
    }
}
