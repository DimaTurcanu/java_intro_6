package string_Methods;

public class _05_ToLowerCase_Method {
    public static void main(String[] args) {
         /*
    1. return type
    2. returns a string
    3.non-static
    4.does not take arguments
         */
        String str1 = "JAVA IS FUN";

        System.out.println(str1.toLowerCase());
        char c = 'A';
        System.out.println(Character.toLowerCase(c)); // c
        System.out.println(String.valueOf(c).toLowerCase()); // c
    }
}
