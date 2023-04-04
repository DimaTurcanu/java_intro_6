package mock02;

public class Practice03_Task05 {
    public static void main(String[] args) {
        String str1 = "123456";
        String str2 = "Blue";
        if (str1.length()<2 ||str2.length()<2) System.out.println("Invalid input!");
        else {
            System.out.println(str1.substring(1,str1.length()-1) + str2.substring(1,str2.length()-1));
        }
    }
}
