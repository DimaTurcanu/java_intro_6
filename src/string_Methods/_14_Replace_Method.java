package string_Methods;

public class _14_Replace_Method {
    public static void main(String[] args) {
        String str = "ABC123";
        str = str.replace("ABC", "abc");
        System.out.println(str);
        System.out.println(str.replace("2", ""));
    }
}
