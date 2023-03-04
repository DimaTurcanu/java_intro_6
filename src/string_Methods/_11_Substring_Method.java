package string_Methods;

public class _11_Substring_Method {
    public static void main(String[] args) {

        String str = "I love java";
        String firstWord = str.substring(2,6);
        System.out.println(firstWord); // love > str.charAt(0)
        String secondWord = str.substring(7);
        System.out.println(secondWord);
    }
}
