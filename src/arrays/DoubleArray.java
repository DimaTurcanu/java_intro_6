package arrays;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {


        double [] doubles =  {5.5, 6, 10.3, 25};


        System.out.println(Arrays.toString(doubles));

        System.out.println("The length is " + doubles.length);

        for (double number : doubles) {
            System.out.println(number);
        }


    }
}
