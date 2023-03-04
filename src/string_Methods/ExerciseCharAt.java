package string_Methods;

import utilities.ScannerHelper;

public class ExerciseCharAt {
    public static void main(String[] args) {
       String str = "TechGlobal";
        System.out.println(str.charAt(4));

        System.out.println(str.charAt(str.length()-1));

       String strFromUser = ScannerHelper.getString();
        System.out.println(strFromUser.charAt(strFromUser.length()-1));



    }
}
