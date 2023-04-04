package mock02;

public class Practice04_Task05 {
    public static void main(String[] args) {


        int[] fib = new int[10];

        fib[0] = 0; // first Fibonacci number is always 0
        fib[1] = 1; // second Fibonacci number is always 1

        for (int i = 2; i < 10; i++) {
            fib[i] = fib[i-1] + fib[i-2]; // calculate next Fibonacci number
        }

        // print out the Fibonacci sequence
        for (int i = 0; i < 9; i++) {
            System.out.print(fib[i] + " - ");
        }
        System.out.print(fib[fib.length-1]);
    }
}