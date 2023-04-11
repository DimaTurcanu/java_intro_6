package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {
    public static void main(String[] args) {
        System.out.println(countMultipleWords(new String[]{"foo", "", " ", "foo bar", "java is fun", " ruby "}));
        System.out.println(removeNegatives(new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15))));
        System.out.println(validatePassword("bcd123"));
        System.out.println(validateEmailAddress("ab@3a.cm"));
    }

    public static int countMultipleWords(String[] arr) {
        /*
        int count = 0;
        for (String s : arr) {
            if (s.trim().contains(" ")) count++;
        } return count;
         */
        return (int) Arrays.stream(arr).filter(e -> e.trim().contains(" ")).count();
    }

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> list) {
        list.removeIf(e -> e < 0);
        return list;
    }

    public static boolean validatePassword(String password) {

        int upper = 0, lower = 0, special = 0, digit = 0;

        if ((password.length() >= 8 && password.length() <= 16) && !password.contains(" ")) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) upper++;
                else if (Character.isLowerCase(c)) lower++;
                else if (Character.isDigit(c)) digit++;
                else special++;
            }
        }
        return upper > 0 && lower > 0 && digit > 0 && special > 0;
    }

    public static boolean validateEmailAddress(String email) {
        if (!email.contains(".") || !email.contains("@") || email.contains(" ")) return false;
        else {
            String[] name = email.split("@");
            String[] domain = name[1].split("\\.");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(domain));
            list.add(name[0]);
            System.out.println(list);
            for (String s : list) {
                if (s.contains("@") || s.contains(".")) return false;
            }

            return (name[0].length() >= 2 && domain[0].length() >= 2 && domain[1].length() >= 2);
        }
    }
}
