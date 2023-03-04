package mathClass;

public class FindMax {
    public static void main(String[] args) {
        int num1 =10, num2 = 15;
        int max = Math.max(num1, num2);
        System.out.println(max);

        // Finding the max of 4 numbers

        int number1 = 2, number2 = 8, number3 = 5, number4 = 18;
        int max1 = Math.max(number1, number2);
        int max2 = Math.max(number3, number4);

        int max3 = Math.max(max1, max2);
        System.out.println(max3);

        // 3 numbers

        number1 = -30;
        number2 = -40;
        number3 = 0;

        max1 = Math.max(number1, number2);//0
        System.out.println(Math.max(max1, number3));

        // Finding max for 5 numbers

        int a = 5, b = 10, c = 5, d = 189, f = 12;

        System.out.println(Math.max(Math.max(a,b), Math.max(Math.max(c,d), f)));

    }
}
