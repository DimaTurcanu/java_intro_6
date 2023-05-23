package concatenation;

public class Exercise01 {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello " + "World");
        System.out.println("Hello" + " World");
        System.out.println("Hello" + " " + "World");
        System.out.println("Today" + " " + "is" + " " + "Sunday");

        System.out.println("123" + " " + "12"); // 123 12


        System.out.println("\t" + "12" + "\t\nab");
        /*
                12
             ab
         */
        int y = 3;  if(y == 0 || y == 1) System.out.println( 1);
        else {
            int temp = y;
            for (int i = 2; i < temp; i++) {
                y*= i;
            }
        }
        System.out.println(y);
    }

    }

