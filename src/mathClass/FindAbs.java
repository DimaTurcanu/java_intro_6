package mathClass;

public class FindAbs {
    public static void main(String[] args) {
        // -35 -> |-35| = 35
        int num = -100;
        System.out.println(Math.abs(num));
        System.out.println(Math.abs(-345));
        System.out.println(Math.abs(50-55)); // converts to positive 5
    }
}
