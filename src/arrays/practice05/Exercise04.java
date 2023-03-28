package arrays.practice05;

public class Exercise04 {
    public static void main(String[] args) {
checkContains();
    }

    public static void checkContains() {
        String[] list = {"banana", "orange", "Apple"};
        boolean apple = false;

        for (String s : list) {
            if (s.equalsIgnoreCase("appe")) {
                apple = true;
                break;

            }

        }System.out.println(apple);
    }
}
