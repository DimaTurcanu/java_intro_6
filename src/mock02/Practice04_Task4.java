package mock02;

public class Practice04_Task4 {
    public static void main(String[] args) {
       String str = "papa";
       if (str.length()<2) System.out.println("Length is less than 2");
       else System.out.println(str.substring(0,2).equals(str.substring(str.length()-2)));



    }
}
