package mock02;

public class Practice04_Task01 {

    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 5 == 0) System.out.println("FooBar");
            else  if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
    }
    public static String doubleChar(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++){
            str1 ="" + str.charAt(i) + str.charAt(i);
        } return str1;
    }


}
