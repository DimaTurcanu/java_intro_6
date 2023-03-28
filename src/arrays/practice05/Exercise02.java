package arrays.practice05;

public class Exercise02 {
    public static void main(String[] args) {
        getShortestLongest();
    }

    public static void getShortestLongest() {

        String[] words = {"black", "red", "blue", "yellow", "white"};

        String longest = words[0];
        String shortest =words[0];

        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
            else if (word.length() < shortest.length()) shortest = word;
        }
            System.out.println(longest);
            System.out.println(shortest);

    }
}
