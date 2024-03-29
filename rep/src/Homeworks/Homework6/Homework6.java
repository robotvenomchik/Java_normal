package Homeworks.Homework6;
import javax.print.attribute.DocAttributeSet;
import java.util.Arrays;

public class Homework6 {

    public static void main(String[] args) {
        //1
        int[][] array = {
                         {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};
        //7
        int[][] arrayForSeven = {
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}};
        //8
        int[][] arrayForEight = {
                                {1, -2, 3},
                                {-4, 5, 6},
                                {7, 8, -9}};
        //11
        int[][] arrayForEleven = {{1, 0, 0},
                                 {4, 0, 6},
                                  {7, 0, 9}};
        //15
        int[][] arrayForFifteen = {
                                 {1, 0, 0},
                                 {4, 0, 6},
                                 {7, 0, 9}};
        System.out.println("------------------------------1----------------------------------");
        // 1
        int sumAll = task1(array);
        System.out.println("Сума всіх елементів: " + sumAll);
        System.out.println("------------------------------2----------------------------------");

        // 2
        double average = task2(array);
        System.out.println("Середнє арефметичне: " + average);
        System.out.println("------------------------------3----------------------------------");

        // 3.
        int[] maxRow = task3(array);
        System.out.println("Найбільший елемент в кожному рядку: " + Arrays.toString(maxRow));
        System.out.println("------------------------------4----------------------------------");

        // 4
        int[] minColumn = task4(array);
        System.out.println("Найменший елемент в кожному стовпці: " + Arrays.toString(minColumn));
        System.out.println("------------------------------5----------------------------------");

        // 5
        int[] sumInEachRow = task5(array);
        System.out.println("Сума елементів в кожному рядку: " + Arrays.toString(sumInEachRow));
        System.out.println("------------------------------6----------------------------------");

        // 6
        boolean PositiveDiagonal = task6(array);
        System.out.println("Eлементи головної діагоналі додатні: " + PositiveDiagonal);
        System.out.println("------------------------------7----------------------------------");

        // 7
        task7(arrayForSeven, 0, 1);
        System.out.println("Масив після обміну рядків: ");
        printArray(arrayForSeven);
        System.out.println("------------------------------8----------------------------------");

        // 8
        int sumRowsNegative = task8(arrayForEight);
        System.out.println("Сума елементів в рядках з від ємними числами: " + sumRowsNegative);
        System.out.println("------------------------------9----------------------------------");

        // 9
        int countEvenNumbers = task9(array);
        System.out.println("Кількість парних чисел в масиві: " + countEvenNumbers);
        System.out.println("------------------------------10----------------------------------");

        // 10
        int countNegativeNumbers = task10(array);
        System.out.println("Кількість від ємних чисел в масиві: " + countNegativeNumbers);
        System.out.println("------------------------------11----------------------------------");

        // 11
        task11(arrayForEleven);
        System.out.println("Масив після заміни нуліків на послідовні числа: ");
        printArray(arrayForEleven);
        System.out.println("------------------------------12----------------------------------");

        // 12
        boolean sameDiagonalSums = task12(array);
        System.out.println("Сума лівої діагоналі дорівнює сумі правої діагоналі: " + sameDiagonalSums);
        System.out.println("------------------------------13----------------------------------");

        // 13
        int sumLeftDiagonal = task13(array);
        System.out.println("Сума елементів на лівій діагоналі: " + sumLeftDiagonal);
        System.out.println("------------------------------14----------------------------------");

        // 14
        int countElementsLessThanNumber = task14(array, 7);
        System.out.println("Кількість елементів, менших за дане число: " + countElementsLessThanNumber);
        System.out.println("------------------------------15----------------------------------");

        // 15
        boolean allUnique = task15(array);
        boolean allUnique2 = task15(arrayForFifteen);
        System.out.println("Усі елементи масиву унікальні: " + allUnique);
        System.out.println("Усі елементи масиву унікальні: " + allUnique2);
    }


    public static int task1(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }


    public static double task2(int[][] arr) {
        int sum = task1(arr);
        int totalElements = arr.length * arr[0].length;
        return (double) sum / totalElements;
    }

    public static int[] task3(int[][] arr) {
        int[] maxInEachRow = new int[arr.length];



        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            maxInEachRow[i] = max;
        }
        return maxInEachRow;
    }

    public static int[] task4(int[][] arr) {
        int[] minInEachColumn = new int[arr[0].length];



        for (int j = 0; j < arr[0].length; j++) {
            int min = arr[0][j];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            minInEachColumn[j] = min;
        }
        return minInEachColumn;
    }

    public static int[] task5(int[][] arr) {

        int[] sumInEachRow = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sumInEachRow[i] = sum;
        }
        return sumInEachRow;
    }

    public static boolean task6(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] <= 0) {
                return false;
            }
        }

        return true;
    }

    public static void task7(int[][] arr, int row1, int row2) {

        int[] temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
    }

    public static int task8(int[][] arr) {
        int sum = 0;



        for (int i = 0; i < arr.length; i++) {

            boolean hasNegative = false;
            int rowSum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];

                if (arr[i][j] < 0) {
                    hasNegative = true;
                }


            }
            if (hasNegative) {
                sum += rowSum;
            }
        }

        return sum;
    }
    public static int task9(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int task10(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < 0) {
                    count++;
                }

            }
        }
        return count;
    }

    public static void task11(int[][] arr) {
        int value = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == 0) {
                    arr[i][j] = value++;
                }

            }
        }
    }

    public static boolean task12(int[][] arr) {

        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < arr.length; i++) {

            leftDiagonalSum += arr[i][i];
            rightDiagonalSum += arr[i][arr.length - 1 - i];

        }

        return leftDiagonalSum == rightDiagonalSum;
    }

    public static int task13(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        return sum;
    }

    public static int task14(int[][] arr, int number) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                int num = arr[i][j];

                if (num < number) {
                    count++;
                }

            }

        }

        return count;
    }

    public static boolean task15(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                for (int k = 0; k < i; k++) {

                    for (int l = 0; l < arr[k].length; l++) {

                        if (arr[i][j] == arr[k][l]) {
                            return false;
                        }

                    }
                }
            }
        }
        return true;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
