package exceptions;

public class _01_Unchecked_Runtime_Exception {
    public static void main(String[] args) {

        String name = "John"; // 0 1 2 3

        int[] numbers = {10, 15, 20};

        // System.out.println(name.charAt(5)); // StringIndexOutOfBoundsException

        // System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException

        String address = null;

        System.out.println(address.toUpperCase()); // NullPointerException

        System.out.println("End of the program");
    }
}