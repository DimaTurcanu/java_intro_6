package string_Methods;

public class Exercise05 {
    public static void main(String[] args) {
        String str = "I go to TechGlobal";
        System.out.println(str.charAt(0));
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(5,7));
        System.out.println(str.substring(str.lastIndexOf(' ')).trim());
    }
}
