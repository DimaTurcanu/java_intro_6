package first_package;

import utilities.ScannerHelper;

public class FirstProgram {
public static void main(String[] args){
    System.out.println("This is Spyderman");
    System.out.println("I am learning Java");
    System.out.println("My name is Dima Turcanu");

    String word = ScannerHelper.getString();

    int last = word.lastIndexOf(" ") + 1;

    System.out.println(word.contains(" ") ? word.substring(last) +  " " + word.substring(0, last) :
            "This sentence does not have 2 or more words to swap");


}

}
