package conditional_statesments;

public class Task4 {
    public static void main(String[] args) {


        char c = '7';

        if ((c >= 65 && c <= 90) || c >= 97 && c <=122 ) {
            System.out.println("Character is a letter");
        } else if (c >= 48 && c <= 57) {
            System.out.println("Character is a digit");
        }


    }
}
