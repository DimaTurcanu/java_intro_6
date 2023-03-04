package string_Methods;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter favorite book.");
        String book = input.nextLine();

        System.out.println("Please enter a quote.");
        String quote = input.nextLine();

        System.out.println(quote.length());
        System.out.println(book.length());
    }
}
