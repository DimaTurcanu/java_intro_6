package conditional_statesments;

import javax.jws.soap.SOAPBinding;

public class IfElseSyntax {
    public static void main(String[] args) {
        boolean condition = true;
        if (condition) {
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }

        System.out.println("End of program");
    }
}
