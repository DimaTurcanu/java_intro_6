package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("=--=--=--=--=--=--=--=-Task01-=--=--=--=--=--=--=--=--=");

        int[] numbers = {-8, 56, 7, 8, 65};

        ArrayList<Integer> uniques = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int number : numbers) {
            if (!uniques.contains(number)) uniques.add(number);
            else if (!duplicates.contains(number)) duplicates.add(number);
        }

        if (duplicates.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(duplicates.get(0));

        System.out.println("=--=--=--=--=--=--=--=-Task02-=--=--=--=--=--=--=--=--=");

        String[] words = {"Z", "abc", "z", "123", "#" };
        boolean foundDuplicate = false;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    foundDuplicate = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("There are no duplicates.");
        }

        System.out.println("=--=--=--=--=--=--=--=-Task03-=--=--=--=--=--=--=--=--=");
        numbers = new int[]{0, -4, -7, 0, 5, 10, 45, -7, 0};
        uniques = new ArrayList<>();
        duplicates = new ArrayList<>();

        for (int number : numbers) {
            if (!uniques.contains(number)) uniques.add(number);
            else if (!duplicates.contains(number)) duplicates.add(number);
        }

        if (duplicates.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(duplicates);


        System.out.println("=--=--=--=--=--=--=--=-Task04-=--=--=--=--=--=--=--=--=");
        words = new String[]{"A","foo", "12" , "Foo", "baR", "a", "a","java"};

        StringBuilder duplicates1 = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            if (duplicates1.toString().toLowerCase().contains(words[i].toLowerCase())) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    duplicates1.append(words[i]).append("\n");
                    break;
                }
            }
        }
        if (duplicates1.length() == 0) {
            System.out.println("There is no duplicates");
        } else {
            System.out.println(duplicates1);
        }
        System.out.println("=--=--=--=--=--=--=--=-Task05-=--=--=--=--=--=--=--=--=");

        String[] words1 = {"abc", "foo", "bar"};
        String[] wordsReversed = new String[words1.length];

        for (int i = 0; i < words1.length; i++) {
            wordsReversed[i] = "";
            for (int j = words1[i].length()-1; j >= 0; j--) {
                wordsReversed[i] += words1[i].charAt(j);
            }
        }
        System.out.println(Arrays.toString(wordsReversed));

        System.out.println("=--=--=--=--=--=--=--=-Task06-=--=--=--=--=--=--=--=--=");

        String str = "Java @#   is fun";
        String [] words2 = new String[]{str.replaceAll("[^\\w ]", "").replaceAll("\\s+", " ").trim()};


        String[] strReversed = new String[words2.length];

        for (int i = 0; i < words2.length; i++) {
            strReversed[i] = "";
            for (int  j = words2[i].length()-1; j>=0; j--){
                strReversed[i] += words2[i].charAt(j);
            }

        }
        System.out.println(Arrays.toString(strReversed));

    }
}
