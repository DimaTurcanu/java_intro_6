package string_Methods;

import java.util.Arrays;

public class _17_Split_Method {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "John - Doe - 11/11/1999 - johndoe@gmail.com - Chicago";

        String[] array1 = str1.split(" ");
        String[] array2 = str2.split("-");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
