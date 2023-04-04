package mock02;

public class Practice05_Task02 {
    public static void main(String[] args) {
        shortestLongest(new String[]{"blue", "yellow", "red", "white"});

    } public static void shortestLongest (String[] arr){

        String lon = "";
        String shor = "asdasdasdasdada";

        for (String s : arr) {
            if (s.length()>lon.length()) lon = s;
            if (s.length()<shor.length()) shor = s;
        }
        System.out.println("The longest word is = " + lon);
        System.out.println("The shortest word is = " + shor);
    }
}
