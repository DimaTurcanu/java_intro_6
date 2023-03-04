package string_Methods;

public class _09_Length_Method {
    public static void main(String[] args) {

    /*
    1. return type
    2. returns a int
    3. Non-static
    4. No arguments
     */
        String str = "I am learning java and it is fun";

        int lengthOfStr = str.length();

        System.out.println(lengthOfStr);//32

        String str2 = "";

        System.out.println(str2.length());//0

        int a=11,b=39;
        int sum = a + b;
        System.out.println(String.valueOf(sum).length()<2);
        System.out.println(String.valueOf(sum).length());
        if (String.valueOf(sum).length()<1) System.out.println(a+b);
        else System.out.println(a);
    }
}
