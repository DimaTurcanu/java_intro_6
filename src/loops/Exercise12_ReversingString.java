package loops;

import utilities.ScannerHelper;

public class Exercise12_ReversingString {
    public static void main(String[] args) {
        String name = ScannerHelper.getFirstName();
        String reversed = "";

        for (int i = name.length()-1; i >= 0; i--) {
        reversed += name.charAt(i);
        }
        System.out.println(reversed);

    }
}
