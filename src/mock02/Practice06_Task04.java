package mock02;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice06_Task04 {
    public static void main(String[] args) {
        System.out.println(list(new ArrayList<String>(Arrays.asList("Tech", "Global", "", null, "", "School"))));
    }
    public static ArrayList<String> list (ArrayList<String> arr){
        /*
        ArrayList<String> filled = new ArrayList<>();
        for (String s : arr) {
            if (!(s == null) && !(s.isEmpty())) filled.add(s);

        }
        return filled;

         */

        arr.removeIf(element -> (element == null) || element.isEmpty());
        return arr;
    }
}
