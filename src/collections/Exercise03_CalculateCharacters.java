package collections;

import java.util.HashMap;
import java.util.Map;

public class Exercise03_CalculateCharacters {
    public static void main(String[] args) {
        /*
        You are given a String as "banana"
        Print all duplicated letters

        Expected:
        a
        n

        Key             Value
        Character       CountOFTheCharacter
        b               1
        a               3
        n               2

        Print the key which has the value more than 1
         */

        System.out.println("\n-----------TASK-1----------\n");

        String str = "banana";

        HashMap<Character, Integer> lettersMap = new HashMap(); // {}

        for (char letter : str.toCharArray()) { // b
            if (!lettersMap.containsKey(letter)) lettersMap.put(letter, 1);
            else lettersMap.put(letter, lettersMap.get(letter) + 1);
        }

        // System.out.println(lettersMap); // {a=3, b=1, n=2}


        for (Map.Entry<Character, Integer> entry : lettersMap.entrySet()) {
            if (entry.getValue() > 1) System.out.println(entry.getKey());
        }


        System.out.println("\n-----------TASK-2----------\n");
        String word = "pineapple";

        Map<Character, Integer> charactersMap = new HashMap<>();
        int count = 0;
        char c = ' ';

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (charactersMap.containsKey(currentChar))
                charactersMap.put(currentChar, charactersMap.get(currentChar) + 1);
            else charactersMap.put(currentChar, 1);

            if (charactersMap.get(currentChar) > count) {
                count = charactersMap.get(currentChar);
                c = currentChar;
            }
        }

        System.out.println("Character \"" + c + "\" is the most counted with " + count + " times.");
    }
}