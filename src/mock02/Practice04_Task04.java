package mock02;

import utilities.ScannerHelper;

public class Practice04_Task04 {
    public static void main(String[] args) {
        String str = ScannerHelper.getString();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e' ||
                    str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o' || str.toLowerCase().charAt(i) == 'u')
                count++;
        }
        System.out.println(count);
    }
}
