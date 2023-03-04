package mothods;

import utilities.ScannerHelper;

public class CheckName {

    public static void main(String[] args) {

       String fName = ScannerHelper.getFirstName();
        String lName = ScannerHelper.getLastName();
        System.out.println("The name entered by the user IS = " + fName + " " + lName);


    }
}
