package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String [] cities = {"Chicago", "Miami", "Toronto"};

        //  The number of elements

        int sizeOfTheArray = cities.length;
        System.out.println(sizeOfTheArray); // 3 elements 

        // Get particular element from the array
        System.out.println(cities[1]); // Miami 
        System.out.println(cities[0]); // Chicago   
        System.out.println(cities[2]); // Toronto

        System.out.println(Arrays.toString(cities)); // Chicago, Miami, Toronto

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[0]);

            System.out.println("------------------for each loop - enhanced loop---------------------");

            for (String element : cities){
                System.out.println(element);
            }
        }
    }
}
