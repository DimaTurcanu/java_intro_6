package arrayList_linkedList_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _11_RemoveElements_Iterator {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 12, 5, 3, 0, 30));
        /*
        numbers.removeIf(x -> x > 10);

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer element : numbers) {
            if (element >= 10) newList.add(element);
        }

        System.out.println(numbers);
         */

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            if (iterator.next() > 10) iterator.remove();
        }
        System.out.println(numbers);

    }


}
