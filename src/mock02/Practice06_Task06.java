package mock02;

import java.util.ArrayList;

public class Practice06_Task06 {
    public static void main(String[] args) {
        System.out.println(remove3orMore("Star Light Start Bright"));

    } public static ArrayList<String> remove3orMore (String str){
        String[] strings = str.split(" ");
        ArrayList<String> uniques = new ArrayList<>();
        for (String s : strings) {
            if (!uniques.contains(s)) uniques.add(s);
        }
        return uniques;
    }
}
