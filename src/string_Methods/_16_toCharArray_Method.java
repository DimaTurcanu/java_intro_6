package string_Methods;

import java.util.Arrays;

public class _16_toCharArray_Method {
    public static void main(String[] args) {

        String name = "John";

        char[] charsOfName = name.toCharArray(); // ACCEPTABLE

        System.out.println(Arrays.toString(charsOfName)); // [J, o, h, n]

        System.out.println(charsOfName[1]);
    }
}