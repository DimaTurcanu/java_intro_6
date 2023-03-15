package loops.control_statements;

import utilities.ScannerHelper;

public class Exercise01_Break {
    public static void main(String[] args) {
        int n1 = ScannerHelper.getNumber();
        int n2 = ScannerHelper.getNumber();

        for (int i = Math.max(n2,n1); i <=Math.max(n1, n2) ; i--) {
            if (i<10) break;
            else System.out.println(i);
        }
    }
}
