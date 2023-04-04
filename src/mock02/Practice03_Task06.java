package mock02;

public class Practice03_Task06 {
    public static void main(String[] args) {
        String str = "xxmuuuuxx";
        if (str.length()<4) System.out.println("INVALID INPUT");
        else System.out.println(str.startsWith("xx") && str.endsWith("xx"));
    }
}
