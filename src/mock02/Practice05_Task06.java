package mock02;

public class Practice05_Task06 {
    public static void main(String[] args) {
        String str = "baNana";
        String s = "";


        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++)
                if ((str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) && !s.contains("" + str.charAt(i)))
                    s += str.charAt(i);

        }
        for (char c : s.toCharArray()) {
            System.out.println(c);

        }

    }
}