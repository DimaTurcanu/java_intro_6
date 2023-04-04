package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n=-=-=-=-=-=-=-=-=-Task1=-=-=-=-=-=-=-=-=-=-=-\n");

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));

        System.out.println(numbers1.get(3));
        System.out.println(numbers1.get(0));
        System.out.println(numbers1.get(2));
        System.out.println(numbers1);

        System.out.println("\n=-=-=-=-=-=-=-=-=-Task2=-=-=-=-=-=-=-=-=-=-=-\n");


        ArrayList <String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("\n=-=-=-=-=-=-=-=-=-Task3=-=-=-=-=-=-=-=-=-=-=-\n");

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));

        System.out.println(numbers2);
        Collections.sort(numbers2);
        System.out.println(numbers2);

        System.out.println("\n=-=-=-=-=-=-=-=-=-Task4=-=-=-=-=-=-=-=-=-=-=-\n");

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n=-=-=-=-=-=-=-=-=-Task5=-=-=-=-=-=-=-=-=-=-=-\n");

        ArrayList <String> marvelCharacters = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));

        System.out.println(marvelCharacters);

        System.out.println(marvelCharacters.contains("Wolwerine"));

        System.out.println("\n=-=-=-=-=-=-=-=-=-Task6=-=-=-=-=-=-=-=-=-=-=-\n");

        ArrayList <String> avenegers = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));
        Collections.sort(avenegers);
        System.out.println(avenegers);

        System.out.println((avenegers.contains("Hulk") && avenegers.contains("Iron Man")));

        System.out.println("\n=-=-=-=-=-=-=-=-=-Task7=-=-=-=-=-=-=-=-=-=-=-\n");

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));

        System.out.println(chars);

        for (Character element : chars) {
            System.out.println(element);
        }

        System.out.println("\n=-=-=-=-=-=-=-=-=-Task8=-=-=-=-=-=-=-=-=-=-=-\n");

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int containsM = 0;

        for (String element : objects) {
            if (element.toLowerCase().startsWith("m")) containsM++;
        }
        System.out.println(containsM);
        System.out.println(objects.stream().filter((x -> !x.toLowerCase().contains("a") && !x.toLowerCase().contains("e"))).count());




        System.out.println("\n=-=-=-=-=-=-=-=-=-Task9=-=-=-=-=-=-=-=-=-=-=-\n");

        ArrayList<String> kitchenObjects = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        System.out.println(kitchenObjects);
        System.out.println("Elements starts with uppercase = " + kitchenObjects.stream().filter(x -> x.charAt(0) >= 65 && x.charAt(0) <= 90).count());
        System.out.println("Elements starts with lowercase = " + kitchenObjects.stream().filter(x -> x.charAt(0) >= 97 && x.charAt(0) <= 122).count());
        System.out.println("Elements having P or p = " + kitchenObjects.stream().filter(x -> x.toLowerCase().contains("p")).count());
        System.out.println("Elements starting or ending with P or p = " + kitchenObjects.stream().filter(x -> x.toLowerCase().startsWith("p") ||
                x.toLowerCase().endsWith("p")).count());



        System.out.println("\n=-=-=-=-=-=-=-=-=-Task10=-=-=-=-=-=-=-=-=-=-=-\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        System.out.println(numbers);
        System.out.println("Elements that can be divided by 10 = " + numbers.stream().filter(x -> x % 10 == 0).count());
        System.out.println("Elements that are even and greater than 15 = " + numbers.stream().filter(x-> x >= 15 && x % 2 == 0).count());
        System.out.println("Elements that are odd and less than 20 = " + numbers.stream().filter(x->x % 2 == 1 && x <20).count());
        System.out.println("Elements that are less than 15 or greater than 50 = " + numbers.stream().filter(x -> x<15 || x>50).count());

    }
}
