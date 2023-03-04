package string_Methods;

public class MethodChaining {
    public static void main(String[] args) {
        String str = "TechGlobal";
        System.out.println((str.toLowerCase().contains("tech")));
        System.out.println(str.toUpperCase().substring(4).length());
    }
}
