package mothods;

import utilities.ScannerHelper;

public class CalculateAge {
    public static void main(String[] args) {

        int age = ScannerHelper.getAge();
        int number = ScannerHelper.getNumber();

        System.out.println("Age will be " +
                (age + number) + " after " + number + " years.");
    }
}

