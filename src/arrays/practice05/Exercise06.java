package arrays.practice05;

public class Exercise06 {
    public static void main(String[] args) {
duplicate();
    }
    public static void duplicate(){
        String str = "baNana";
        String answer = "";
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                        !answer.contains("" + str.charAt(i))) answer+=str.charAt(i);

            }
        }
        for (char c : answer.toCharArray()) {
            System.out.println(c);
        }

    }
}