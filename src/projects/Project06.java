package projects;

import java.util.Arrays;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("\n==============TASK1===============\n");

        findGreatestAndSmallestWithSort(new int[]{10, 7, 7, 10, -3, 10, -3});

        System.out.println("\n==============TASK2===============\n");

        findGreatestAndSmallest(new int[]{10, 7, 7, 10, -3, 10, -3});

        System.out.println("\n==============TASK3===============\n");

        findSecondGreatestAndSmallestWithSort(new int[]{10, 5, 6, 7, 8, 5, 15, 15});

        System.out.println("\n==============TASK4===============\n");

        findSecondGreatestAndSmallest(new int[]{10, 5, 6, 7, 8, 5, 15, 15});

        System.out.println("\n==============TASK5===============\n");

        findDuplicatedElementsInAnArray(new String[] {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"});

        System.out.println("\n==============TASK6===============\n");

        findMostRepeatedElementInAnArray(new String[] {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"});


    }
    public static void  findGreatestAndSmallestWithSort(int [] array) {

        Arrays.sort(array);
        System.out.println("Smallest = " + array[0]);
        System.out.println("Greatest = " + array[array.length - 1]);
    }
    public static void  findGreatestAndSmallest(int [] array) {



        int smallest = array[0];
        int largest = 0;

        for (int i : array) {
            if (i < smallest) smallest = i;
            if (i > largest) largest = i;
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + largest);
    }
    public static void  findSecondGreatestAndSmallestWithSort(int [] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int secondSmallest = array[0];
        int secondGreatest = array[array.length - 1];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > secondSmallest) {
                secondSmallest = array[i];
                break;
            }
        }
        // Find the second-greatest element
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < secondGreatest) {
                secondGreatest = array[i];
                break;
            }
        }

                System.out.println("Second Smallest = " + secondSmallest);
                System.out.println("Second Greatest = " + secondGreatest);
        }
        public static void findSecondGreatestAndSmallest(int [] array) {
                int smallest = array[0];
                int greatest = array[0];

                for (int i = 1; i < array.length; i++) {
                    if (array[i] < smallest) {
                        smallest = array[i];
                    } else if (array[i] > greatest) {
                        greatest = array[i];
                    }
                }
                int secondSmallest = Integer.MAX_VALUE;
                int secondGreatest = Integer.MIN_VALUE;

                // Find the second smallest and second-greatest elements in the array
            for (int j : array) {
                if (j > smallest && j < secondSmallest) {
                    secondSmallest = j;
                }
                if (j < greatest && j > secondGreatest) {
                    secondGreatest = j;
                }
            }

                System.out.println("Second smallest = " + secondSmallest);
                System.out.println("Second greatest = " + secondGreatest);
            }


            public static void findDuplicatedElementsInAnArray(String [] array){
            Arrays.sort(array);
                System.out.println(Arrays.toString(array));
                for (int i = 0; i < array.length -1; i++) {
                    if (array[i].equals(array[i+1])) System.out.println(array[i]);
                }

            }
            public static void  findMostRepeatedElementInAnArray(String [] array){

                    int[] frequencyArray = new int[array.length];

                    for (int i = 0; i < array.length; i++) {
                        frequencyArray[i] = 0;
                    }

                    // Iterate through the array and update the frequency array
                    for (int i = 0; i < array.length; i++) {
                        for (int j = i + 1; j < array.length; j++) {
                            if (array[i].equals(array[j])) {
                                frequencyArray[i]++;
                            }
                        }
                    }

                    // Find the index of the most repeated element in the array
                    int maxFrequencyIndex = 0;
                    for (int i = 1; i < frequencyArray.length; i++) {
                        if (frequencyArray[i] > frequencyArray[maxFrequencyIndex]) {
                            maxFrequencyIndex = i;
                        }
                    }
                    System.out.println("Most repeated element: " + array[maxFrequencyIndex]);
                }


            }


