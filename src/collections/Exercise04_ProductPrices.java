package collections;

import java.util.HashMap;
import java.util.Map;

public class Exercise04_ProductPrices {
    public static void main(String[] args) {
        /*
        Product         Price
        iPhone      ->  1000
        Macbook Pro ->  1300
        iMac        ->  1500
        Airpods     ->  200
        iPad        ->  700

        TASK 1:
        Find the most expensive product and print it as below

        Expected:
        iMac is the most expensive with the price of $1500.0


        TASK 2:
        Find the most affordable product and print it as below

        Expected:
        Airpods is the most affordable with the price of $200.0

         */

        HashMap<String, Double> products = new HashMap<>();
        products.put("iPhone", 1000.0);
        products.put("Macbook Pro", 1300.0);
        products.put("iMac", 1500.0);
        products.put("AirPods", 200.0);
        products.put("iPad", 700.0);

        // Task 1
        String mostExpensiveProduct = "";
        double highestPrice = 0;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (entry.getValue() > highestPrice) {
                highestPrice = entry.getValue();
                mostExpensiveProduct = entry.getKey();
            }
        }
        System.out.printf("%s is the most expensive with the price of $%.1f\n", mostExpensiveProduct, highestPrice);

        // Task 2
        String mostAffordableProduct = "";
        double lowestPrice = Double.MAX_VALUE;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (entry.getValue() < lowestPrice) {
                lowestPrice = entry.getValue();
                mostAffordableProduct = entry.getKey();
            }
        }
        System.out.printf("%s is the most affordable with the price of $%.1f\n", mostAffordableProduct, lowestPrice);


    }

}
