package mock02;

public class Practice05_Task07 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 1, 1, 7, 1};

        int numDuplicates = 0;
        String str = "";

        // Loop through each integer in the array
        for (int i = 0; i < numbers.length; i++) {

            // Compare the current integer with all the integers after it
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !str.contains(numbers[i] + "")) {
                   str += numbers[i];
                   numDuplicates++;
                }
            }

            }
        if (numDuplicates>1) System.out.println(numDuplicates);
        else System.out.println("There is no duplicates");
        }

    }




