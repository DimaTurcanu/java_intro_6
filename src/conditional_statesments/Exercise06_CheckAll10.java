package conditional_statesments;

public class Exercise06_CheckAll10 {
    public static void main(String[] args) {
        int nr1 = (int) (Math.random() * 2) +10;
        int nr2 = (int) (Math.random() * 2) +10;

        System.out.println(nr1==nr2&&nr2==10);
    }
}
