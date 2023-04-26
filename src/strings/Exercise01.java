package strings;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        String is a reference type (object) that is used to store a sequence of characters
        TEXTS
        dataType variableName = "value";
         */

        String name = "xJxohxxxnx";
        String address = "Chicago IL 12345";

        System.out.println(name); // John
        System.out.println(address); // Chicago IL 12345


        /*
        Store your favorite movie name in a String variable called as favMovie
        Then, print it with a message as below
        My favorite movie = {favMovie}
         */

        
        String favMovie = "God Father";

        System.out.println("My favorite movie = " + favMovie);
        if (name.charAt(0) == 'x' && name.charAt(name.length()-1) == 'x')
            System.out.println(name.substring(1, name.length() - 1).replaceAll("x", ""));
    }
}