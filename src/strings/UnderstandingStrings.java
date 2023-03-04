package strings;

public class UnderstandingStrings {
    public static void main(String[] args) {
        String s1; // declaration of s1 as a String

        s1 = "TechGlobal School"; // initializing s1 as TechGlobal School

        String s2 = "is the best"; // declaration of s2 and initializing of s2 as is the best option

        System.out.println("------------------CONCAT USING +-----------------");
        System.out.println(s1);
        System.out.println(s2);
        String s3 = s1 + " " + s2; // concatenation using the + sign even for the space to show between them
        System.out.println(s3); // TechGlobal School is the best

        System.out.println("------------------CONCAT USING METHOD-----------------");
        String s4 = s1.concat(s2);
        System.out.println(s4);

        String wordPart1, wordPart2, wordPart3;
        wordPart1 = "le";
        wordPart2 = "ar";
        wordPart3 = "ning";

        System.out.println(wordPart1 + wordPart2 + wordPart3); // or
        String fullWord = wordPart1 + wordPart2 + wordPart3;
        System.out.println(fullWord);

    }
}
