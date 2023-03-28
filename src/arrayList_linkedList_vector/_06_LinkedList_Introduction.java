package arrayList_linkedList_vector;

import java.util.Arrays;
import java.util.LinkedList;

public class _06_LinkedList_Introduction {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>(Arrays.asList("Berlin", "Rome", "Kyiv", "Ankara", "Madrid", "Chicago"));

        System.out.println(cities.size());
        System.out.println(cities.contains("Miami"));
        System.out.println(cities.indexOf("Evanston"));
        System.out.println(cities.getFirst());
        System.out.println(cities.offer("Gent"));
        System.out.println(cities);
    }
}
