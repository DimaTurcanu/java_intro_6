package Practices;

import utilities.ScannerHelper;

public class Exercise01_StringMethods {
    public static void main(String[] args) {
        System.out.println("------------------------TASK1-----------------------");

        String str = ScannerHelper.getString();
        System.out.println("The string given is = " + str);

        System.out.println("------------------------TASK2-----------------------");

        if (str.isEmpty())
            System.out.println("The given string is empty");
        else System.out.println("The length is = " + str.length());
        //System.out.println(str.isEmpty()?("The given string is empty"):("The length is = " + str.length()));

        System.out.println("------------------------TASK3-----------------------");

        System.out.println((!str.isEmpty())?("The first character = " + str.charAt(0)):("There is no character in this string"));



        System.out.println("------------------------TASK4-----------------------");


        System.out.println( (!str.isEmpty())?("The last character = " + str.charAt(str.length()-1)):("There is no character in this string"));


        System.out.println("------------------------TASK5-----------------------");

        if (str.toLowerCase().contains("a") ||
                str.toLowerCase().contains("i") ||
                str.toLowerCase().contains("o") ||
                str.toLowerCase().contains("u") ||
                str.toLowerCase().contains("e")) System.out.println("This string has vowel");
        else System.out.println("This string does not have vowel");


    }
}
