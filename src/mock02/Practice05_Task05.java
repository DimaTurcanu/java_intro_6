package mock02;
public class Practice05_Task05 {
    public static void main(String[] args) {

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean numEqual = false;
        for (int i : numbers1) {
            for (int j : numbers2) {
                if (i == j) {
                    System.out.println(i);
                    numEqual = true;

                }
            }
        } if (numEqual== false) System.out.println("There is no matching elements");
    }
    }
