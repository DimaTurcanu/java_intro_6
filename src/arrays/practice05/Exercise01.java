package arrays.practice05;

public class Exercise01 {
    public static void main(String[] args) {
getFirstPosAndNeg();

        }

        public static void getFirstPosAndNeg(){

        int [] numbers = {0, -4, -7, 0, 5, 10, 45};

        int firstPos = 0, firstNeg = 0;

            for (int number : numbers) {
                if (number>0){ firstPos = number;
                    break;
            }
            }

            for (int number : numbers) {
                if (number<0) {
                    firstNeg = number;
                    break;
                }
            }
            System.out.println("First positive number is " + firstPos);
            System.out.println("First negative number is " + firstNeg);
        }
    }

