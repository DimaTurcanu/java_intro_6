package mock02;

public class Practice05_Task06 {
    public static void main(String[] args) {
        String str = "1cat1cadodog";
        String s = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++)
                if ((str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) && !s.contains("" + str.charAt(i)))
                    s += str.charAt(i);

        }

        String str1 = "abc.xyzxy";

        boolean xyz = false;
        for (int i= 0; i<str.length()-4; i++){
            if (str1.charAt(i) != '.' && str1.startsWith("xyz", i+1)){
                xyz = true;
                break;
            }
        }
        System.out.println(xyz);;


    }
}
