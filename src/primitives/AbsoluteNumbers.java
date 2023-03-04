package primitives;

public class AbsoluteNumbers {
    public static void main(String[] args) {
        /*
        Absolute numbers: 1, 5,-3, -123,  23239884
        byte -> -128 to 127 (inclusive cause of 0)
        short -> -32768 to 32767
        int -> -2147483648 to 2147483647
        long

        dataType variableName = value
         */

        System.out.println("\n-----------byte----------\n");
        byte myNumber =12;
        System.out.println(myNumber); //12

        System.out.println("123" + " " + "12"); // 123 12
        System.out.println("The max value of byte = " + Byte.MAX_VALUE); // 127
        System.out.println("The min value of byte = " + Byte.MIN_VALUE); // -128

        System.out.println("\n-----------short----------\n");
        short numberShort = 150;

        System.out.println(numberShort); // 150

        System.out.println("The max value of short = " + Short.MAX_VALUE); //32767
        System.out.println("The min value of short = " + Short.MIN_VALUE); //-32678

        System.out.println("\n----------int---------\n");
        int myInteger = 20000000;

        System.out.println(myInteger);
        System.out.println("The max value of int = " + Integer.MAX_VALUE); //2147483647
        System.out.println("The min value of int = " + Integer.MIN_VALUE); // -2147483648

        System.out.println("\n----------long---------\n");
        long myBigNumber = 21474832147483648L;

        System.out.println(myBigNumber); // 2147483648l

        // Numbers bigger than int can be stored here

        System.out.println("\n----------long more info---------\n");
        long l1 = 5;
        long l2 = 21237672891883L; // We need the L because is more than the capacity of the int

        System.out.println(l1); //5
        System.out.println(l2); //21237672891883

    }
}
