package operators.increment_decrement_operators;

public class PostIncrementPostDecrement {
    public static void main(String[] args) {
        int num1 =10, num2 = 10;
        System.out.println("----------------Task1--------------------");

        System.out.println(num1++); //10
        System.out.println(num1); //11
        System.out.println(++num2); //11

        System.out.println("----------------Task2--------------------");
        int n1 = 5, n2 = 7;
        n1 +=n2;

        System.out.println(n1);

        System.out.println("----------------Task3--------------------");
        int i1 = 10;
        --i1; // decrease right now - 9
        i1--; // decrease next use - 8
        System.out.println(--i1); // subtract again right now - 7

        System.out.println("----------------Task4--------------------");
        int nr1 = 50;
        nr1 -= 25;
        nr1 -=10;
        System.out.println(nr1--);

        System.out.println("----------------Task5--------------------");
        int i =5;
        int age = 10 * i++;
        System.out.println(age); // 50, i++ never gainer +1
        int year = 10 * ++i;
        System.out.println(year); // 60
        System.out.println("\n---------TASK-6-----------\n");
        int var1 = 27;

        int result = --var1 / 2; // 13

        System.out.println(++result); // 14
    }
}
