package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02_CountNumbers {
    public static void main(String[] args) {
        System.out.println(countEven(new ArrayList<>(Arrays.asList(2,3,5))));
        more15(new ArrayList<>(Arrays.asList(2,3,5)));
    }

    public static int countEven (ArrayList<Integer> numbers){
       /* int countEven = 0;
        for (Integer number : numbers) {
            if (number%2==0) countEven++;
        }
        return countEven;

        */
        return (int) numbers.stream().filter(element-> element % 2 == 0).count();
    }
    public static void more15(ArrayList<Integer> list){
        System.out.println(list.stream().filter(element -> element>15).count());
    }
    public static int no3(ArrayList<Integer> list){
       /*
        int count = 0;
        for (Integer integer : list) {
            if(integer.toString().contains("3"))  count++;
        } return count;

        */
        return (int) list.stream().filter(element-> element.toString().contains("3")).count();
    }
}
