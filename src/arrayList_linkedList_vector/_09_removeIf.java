package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _09_removeIf {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Purple", "Blue", "Yellow"));

        System.out.println("Before remove = " + colors);

        colors.removeIf(element -> element.toLowerCase().contains("r"));

        String str = "abchdfjsabc";
        int n = 1;

        String index = String.valueOf(str.charAt(n-1));
        System.out.println(index);
        str = str.replaceFirst(index , "");
        System.out.println(str);
        System.out.println(str.contains(index));
    }
}
