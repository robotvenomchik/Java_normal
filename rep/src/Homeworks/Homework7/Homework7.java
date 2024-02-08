package Homeworks.Homework7;

public class Homework7 {
    public static void main(String[] args) {
        int [] arr={2,4,1,3};

        System.out.println("Original arr");
        printArray(arr);

        insertSrt(arr);

        System.out.println("\nSorted arr");
        printArray(arr);

        System.out.println("---------------------------------------");
        String small = "32";
        System.out.println(minPartitions(small));
        String big = "82734";
        System.out.println(minPartitions(big));
    }
    public static void insertSrt(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int minPartitions(String n) {
        int maxDigit = 0;

        for (char digit : n.toCharArray()) {
            int currentDigit = digit - '0';

            maxDigit = Math.max(maxDigit, currentDigit);
        }
        return maxDigit;
    }
}


