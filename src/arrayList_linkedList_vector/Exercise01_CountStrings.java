package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_CountStrings {
    public static void main(String[] args) {

        System.out.println(countO(new ArrayList<>(Arrays.asList("Hello", "Hi", "School", "Computer"))));
        System.out.println(countO(new ArrayList<>(Arrays.asList("abc", "xyz"))));
        System.out.println(more3(new ArrayList<>(Arrays.asList("abc", "xz"))));
    }
    public static int countO(ArrayList<String> strings) {
        int count = 0;
        for (String str : strings) {
            if (str.toLowerCase().contains("o")) {
                count++;
            }
        }
        return count;
    }

    public static int more3(ArrayList<String> list){
        int count3 = 0;
        for (String str : list) {

            if (str.length()>=3) count3++;
        }
        return count3;
    }
}
