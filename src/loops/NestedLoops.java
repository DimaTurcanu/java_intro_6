package loops;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop value is = " + i);

            // inner loop

            for (int j = 1; j <= 5; j++) {
                System.out.println("Inner loop value is = " + j);
            }
        }
    }
}
