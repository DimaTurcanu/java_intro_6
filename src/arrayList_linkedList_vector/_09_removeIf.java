package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _09_removeIf {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Purple", "Blue", "Yellow"));

        System.out.println("Before remove = " + colors);

        colors.removeIf(element -> element.toLowerCase().contains("r"));
    }
}
