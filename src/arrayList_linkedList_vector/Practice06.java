package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice06 {
    public static void main(String[] args) {
        System.out.println("-----------------Task1-----------------");
        System.out.println(Arrays.toString(double1(new int[]{3, 2, 5, 7, 9})));
        System.out.println(secondMax(new ArrayList<>(Arrays.asList(3, 2, 5, 6, 6, 6))));
        System.out.println(secondMin(new ArrayList<>(Arrays.asList(3, 2, 2, 5, 6, 6, 6))));
        System.out.println(removeElements(new ArrayList<>(Arrays.asList("tech", "global", "", "school"))));
        System.out.println(remove3OrMore(new ArrayList<>(Arrays.asList(333, 24, 232, 545, 62, 6, 67))));
        System.out.println(uniqueWords("Star light Star bright"));



    }

    public static int[] double1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }

    public static int secondMax(ArrayList<Integer> list) {
        Collections.sort(list);
        int secondMax = Integer.MIN_VALUE;
        int max = list.get(list.size() - 1);
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) < max) return list.get(i);

        }
        return 0;


    }

    public static int secondMin(ArrayList<Integer> list) {
        Collections.sort(list);

        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > min) return list.get(i);

        }
        return 0;
    }
    public static ArrayList<String> removeElements (ArrayList<String> list){
        list.removeIf(element -> element == null || element.isEmpty());
        return list;
        /*
        ArrayList<String> empty = new ArrayList<>();


        for (String s : list) {
            if (!s.isEmpty()) empty.add(s);
        }return empty;

         */

    } public static ArrayList<Integer> remove3OrMore (ArrayList<Integer> list){
        list.removeIf(element -> element >= 100 || element <= -100); // Math.abs(e) >= 100;
        return list;
    }
    public static ArrayList<String> uniqueWords (String str) {
        String[] words = str.split(" ");
        ArrayList<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }
}
