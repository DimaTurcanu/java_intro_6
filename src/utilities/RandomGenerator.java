package utilities;

import java.util.Random;

public class RandomGenerator {
    public static int getRandomNumber(int start, int end){
        return new Random ().nextInt(end - start + 1) + start;
    }
}
