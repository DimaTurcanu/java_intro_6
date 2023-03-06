package projects;

import utilities.ScannerHelper;

public class Project04 {
    public static void main(String[] args) {

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-TASK1=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String str = ScannerHelper.getString();
        if (str.length() < 8) System.out.println("This String does not have 8 characters");
        else
            System.out.println(str.substring(str.length() - 4).concat(str.substring(4, str.length() - 4).concat(str.substring(0, 4))));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-TASK2=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String sentence = ScannerHelper.getString();

        if (sentence.contains(" "))
            System.out.println(sentence.substring(sentence.lastIndexOf(" ") + 1).concat(sentence
                    .substring(sentence.indexOf(" "), sentence.lastIndexOf(" "))).concat(" ").concat(sentence.substring(0, sentence.indexOf(" "))));
        else System.out.println("This sentence does not have 2 or more words to swap");

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-TASK3=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String badWords = ScannerHelper.getString();

        if (badWords.toLowerCase().contains("stupid") || badWords.toLowerCase().contains("idiot")) {
            System.out.println(badWords.replace("idiot", "nice").replace("stupid", "nice"));

        } else System.out.println(badWords);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-TASK4=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String name = ScannerHelper.getFirstName();
        if (name.length() <= 2) System.out.println("Invalid input!!!");
        else if (name.length() % 2 != 0) System.out.println(name.charAt(str.length() / 2));
        else System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-TASK5=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String country = ScannerHelper.getfavCountry();
        if (country.length() <= 5) System.out.println("Invalid input!!!");
        else System.out.println(country.substring(2, country.length() - 2));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-TASK6=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String address = ScannerHelper.getAddress();
        if (address.toLowerCase().contains("a") || address.toLowerCase().contains("i") || address.toLowerCase().contains("e")
                || address.toLowerCase().contains("o") || address.toLowerCase().contains("u"))

            System.out.println(address.replace("a", "*").replace("e", "#").replace("i", "+")
                    .replace("u", "$").replace("o", "@").replace("A", "*")
                    .replace("E", "#").replace("I", "+")
                    .replace("U", "$").replace("O", "@"));
        else System.out.println(address);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-TASK7=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String nrOfWords = ScannerHelper.getString();
        String noSpaces = nrOfWords.replace(" ", "");

        if (nrOfWords.contains(" ")) System.out.println("The number of words is " + (nrOfWords.length() - noSpaces.length() + 1));
        else System.out.println("The string has only one word");

    }
}
