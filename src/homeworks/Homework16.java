package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework16 {

    public static void main(String[] args) {

        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));


        Map<String, Integer> shoppingItems1 = new HashMap<>();
        shoppingItems1.put("Apple", 3);
        shoppingItems1.put("Mango", 1);
        double totalPrice1 = calculateTotalPrice(shoppingItems1);
        System.out.println(totalPrice1);
    }

    public static Map<Integer, String> parseData(String input) {
        Map<Integer, String> result = new TreeMap<>();

        int keyStart = -1;
        int valueStart = -1;
        boolean readingKey = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '{') {
                readingKey = true;
                keyStart = i + 1;
            } else if (ch == '}') {
                if (keyStart != -1 && valueStart != -1) {
                    int key = Integer.parseInt(input.substring(keyStart, i));
                    String value = input.substring(valueStart, i);
                    result.put(key, value);
                    keyStart = -1;
                    valueStart = -1;
                }
                readingKey = false;
            } else if (readingKey && keyStart != -1) {
                valueStart = i + 1;
            }
        }

        return result;
    }

    public static double calculateTotalPrice(Map<String, Integer> shoppingItems) {

        Map<String, Double> itemPrices = new HashMap<>();
        itemPrices.put("Apple", 2.00);
        itemPrices.put("Orange", 3.29);
        itemPrices.put("Mango", 4.99);
        itemPrices.put("Pineapple", 5.25);

        double totalPrice = 0.0;

        for (Map.Entry<String, Integer> entry : shoppingItems.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();

            if (itemPrices.containsKey(item)) {
                double price = itemPrices.get(item);
                totalPrice += price * quantity;
            }
        }

        return totalPrice;
    }
}
