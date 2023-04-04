package mock02;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice06_Task05 {
    public static void main(String[] args) {
        System.out.println(remove3orMore(new ArrayList<>(Arrays.asList(-12, -123, -5, 1000, 500, 0))));

    }
    public static ArrayList<Integer> remove3orMore (ArrayList<Integer> numbers){
        numbers.removeIf(element -> element >=100 || element <= -100);
        return numbers;
    }
}
