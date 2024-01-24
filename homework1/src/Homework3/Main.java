package Homework3;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------1-----------------------");

        printSequence1();
        System.out.println("-------------------------2-----------------------");
        printSequence2();
        System.out.println("-------------------------3-----------------------");

        printSequence3();
        System.out.println("-------------------------4-----------------------");

        printMultiplesOfFive();
        System.out.println("-------------------------5-----------------------");

        sumAndCountEvenNumbers();
        System.out.println("-----------------------------SPECIAL TASK");
        int[] array = {4, 8, 2, 10, 5};
        int max = findMaxValue(array);
        System.out.println("MAX =  " + max);
    }
    // Завдання 1
    public static void print1() {
        for (int i = 1; i <= 55; i++) {
            System.out.print(2 * i - 1 + " ");
        }
        System.out.println();
    }

    // Завдання 2
    public static void print2() {
        for (int i = 90; i >= 60; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Завдання 3
    public static void print3() {
        int num = 2;
        for (int i = 0; i < 20; i++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }

    // Завдання 4
    public static void print4() {
        for (int i = -29; i <= 10; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Завдання 5
    public static void print5() {
        int sum = 0;
        int countEven = 0;

        for (int i = 50; i <= 150; i++) {
            sum += i;
            if (i % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("Sum of numberrs " + sum);
        System.out.println("Count even numbers " + countEven);
    }
    public static int findMaxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("no null masiv");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
