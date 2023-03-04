package string_Methods;

public class ExerciseGetCharOrChars {
    public static void main(String[] args) {
        String name1 = "Bilal";
        String name2 = "Matthew";
        String name3 = "Ronaldo!!";

        System.out.println(name1.charAt((name1.length())/2));
        System.out.println(name2.charAt((name2.length())/2));
        System.out.println(name3.charAt((name3.length())/2));

        String name4 = "OKAN";
        String name5 = "YOUSEF";
        System.out.println("" + name4.charAt(name4.length()/2 - 1) + name4.charAt(name4.length()/2));
        System.out.println("" + name5.charAt(name5.length()/2 - 1) + name5.charAt(name5.length()/2));

    }
}
