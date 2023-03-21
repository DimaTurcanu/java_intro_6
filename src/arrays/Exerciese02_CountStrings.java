package arrays;

import java.util.Arrays;

public class Exerciese02_CountStrings {
    public static void main(String[] args) {

        String[] countries = new String[3];

        countries[1] = "Spain";

        for (int i = 1; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
        countries[0] = "Belgium";
        countries[2] = "Italy";

        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

        for (String element : countries
             ) {
            System.out.println(element);

        }
        int count5 =0;
        for (String country : countries) {
            if (country.length() == 5) count5++;
        }
        System.out.println(count5);

        int containsI = 0;

        for (String country : countries) {
            if (country.toLowerCase().contains("i")) containsI++;
        }
        System.out.println(containsI);


    }
}
