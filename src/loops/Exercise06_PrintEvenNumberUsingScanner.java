package loops;

import utilities.ScannerHelper;

public class Exercise06_PrintEvenNumberUsingScanner {
    public static void main(String[] args) {
        int userNr1 = ScannerHelper.getNumber();
        int userNr2 = ScannerHelper.getNumber();

        if (userNr1 > userNr2) for (int i = userNr2; i <= userNr1; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
        else if (userNr1 < userNr2) for (int j = userNr1; j <= userNr2; j++) {
            if (j % 2 == 0) System.out.println(j);
        }
        else for (int k = userNr1; k <= userNr2; k++) {
            if (k % 2 == 0) System.out.println(k);

        }


        // or 2nd easy way

        for (int l = Math.min(userNr2, userNr1); l <= Math.max(userNr2, userNr1) ; l++) {
            if (l % 2 == 0) System.out.println(l);
        }
    }
}
