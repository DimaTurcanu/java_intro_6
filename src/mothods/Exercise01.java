package mothods;

import utilities.MatchHelper;
import utilities.RandomGenerator;

public class Exercise01 {
    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {


            int r1 = RandomGenerator.getRandomNumber(5, 8);
            int r2 = RandomGenerator.getRandomNumber(3, 4);
            int r3 = RandomGenerator.getRandomNumber(10, 12);
            int r4 = MatchHelper.max(r1, r2, r3);
            int r5 = MatchHelper.sum(MatchHelper.max(r1, r2, r3), RandomGenerator.getRandomNumber(10, 23));
            System.out.println(r5);

        }
    }

}
