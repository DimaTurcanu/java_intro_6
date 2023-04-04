package mock02;

public class Practice05_Task01 {
    public static void main(String[] args) {
        firstPosAndNeg(new int[]{0, -4, -7, 0, 10, 5, 4});
    }

    public static void firstPosAndNeg(int[] arr) {
        for (int num : arr) {
            if (num < 0) {
                System.out.println("First negative number is = " + num);
                break;
            }
            for (int num1 : arr) {

                if (num1 > 0) {
                    System.out.println("First positive number is = " + num1);
                    break;
                }
            }
        }
    }
}
