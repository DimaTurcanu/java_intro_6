package homeworks;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=TASK1-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String name = ScannerHelper.getFirstName();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() -1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));
        if (name.toLowerCase().charAt(0)== 'a') System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=TASK2-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String address = ScannerHelper.getAddress();
        if (address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plaines"))
            System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=TASK3-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String favCountry = ScannerHelper.getfavCountry();
        if(favCountry.toLowerCase().contains("a") && favCountry.toLowerCase().contains("i"))
            System.out.println("A and i are there");
        else if (favCountry.toLowerCase().contains("a"))
            System.out.println("A is there");
        else if (favCountry.toLowerCase().contains("i"))
            System.out.println("I is there");
        else System.out.println(("A and i are not there"));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=TASK4-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String str = "  Java is FUN   ";
        String str1 = str.trim().toLowerCase().substring(0,4);
        String str2 = str.trim().toLowerCase().substring(5,7);
        String str3 = str.trim().toLowerCase().substring(8,11);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
