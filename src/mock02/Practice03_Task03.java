package mock02;

public class Practice03_Task03 {
    public static void main(String[] args) {
        String str = "Python";
        if (str.length() < 4) System.out.println("\"INVALID INPUT\"");
        else {
            System.out.println("First 2 characters are = " + str.substring(0, 2));
            System.out.println("Last 2 characters are = " + str.substring(str.length()-2));
            System.out.println("The other characters  are = " + str.substring(2, str.length()-2));

        }
    }
}
