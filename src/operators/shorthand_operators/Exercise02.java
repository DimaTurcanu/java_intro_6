package operators.shorthand_operators;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter your balance");
        double balance = inputReader.nextDouble();

        System.out.println("The initial balance is $"+ balance);

        System.out.println("What is the first transaction");
        double firstTransaction = inputReader.nextDouble();

        balance -= firstTransaction;

        System.out.println("The balance after first transaction is $" + balance);

        System.out.println("What is the second transaction");

        double secondTransaction = inputReader.nextDouble();

        balance -= secondTransaction;
        System.out.println("The balance after second transaction is $" + balance);

        System.out.println("What is the third transaction");

        double thirdTransaction = inputReader.nextDouble();

        balance -= thirdTransaction;
        System.out.println("The balance after third transaction is $" + balance);

        // or could be done like this
        System.out.println("What is the first transaction");
        System.out.println("The balance after first transaction is $" + (balance -= inputReader.nextDouble()));
        System.out.println("What is the second transaction");
        System.out.println("The balance after second transaction is $" + (balance -= inputReader.nextDouble()));
        System.out.println("What is the third transaction");
        System.out.println("The balance after third1 transaction is $" + (balance -= inputReader.nextDouble()));







    }
}
