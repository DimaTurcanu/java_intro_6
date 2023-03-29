package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_ArrayList_To_Array {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C#");
        languages.add("JS");
        languages.add("Ruby");

        System.out.println(languages);

        Object [] myArray = languages.toArray();
        System.out.println(Arrays.toString(myArray));
    }
}
