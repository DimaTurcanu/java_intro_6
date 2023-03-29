package arrayList_linkedList_vector;

import java.util.ArrayList;

public class _07_ArrayList_To_Array {
    public static void main(String[] args) {

        System.out.println(uniques(new int [] {3, 4, 7, 3, 5}));
        System.out.println(uniques(new int [] {5, 5, 5, 5}));
        System.out.println(uniques(new int [] {13, 20, 13, 20}));
        System.out.println(uniques(new int [0]));


    } public static ArrayList<Integer> uniques (int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
           if (!list.contains(i)) list.add(i);
        }return list;
    }
}

