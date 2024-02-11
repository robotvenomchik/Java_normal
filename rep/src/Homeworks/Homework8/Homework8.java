package Homeworks.Homework8;

public class Homework8 {

    public static void main(String[] args) {
        System.out.println("----------------------------------------1-------------------------------------------------");

        System.out.println(task1(1));
        System.out.println(task1(0));
        System.out.println(task1(-3));
        System.out.println("----------------------------------------2-------------------------------------------------");
        System.out.println(task2(1));
        System.out.println(task2(0));
        System.out.println(task2(-3));
        System.out.println("----------------------------------------3-------------------------------------------------");

        System.out.println(task3(1));
        System.out.println(task3(0));
        System.out.println(task3(-3));
        System.out.println("----------------------------------------4-------------------------------------------------");

        System.out.println(task4(1));
        System.out.println(task4(0));
        System.out.println(task4(-3));
        System.out.println("----------------------------------------5-------------------------------------------------");

        System.out.println(task5(1));
        System.out.println(task5(0));
        System.out.println(task5(-3));
        System.out.println("----------------------------------------6-------------------------------------------------");

        System.out.println(task6(1));
        System.out.println(task6(0));
        System.out.println(task6(-3));
        System.out.println("----------------------------------------7-------------------------------------------------");

        System.out.println(task7("test"));
        System.out.println(task7("тест"));
        System.out.println(task7(3));
        System.out.println("----------------------------------------8-------------------------------------------------");

        System.out.println(task8(1));
        System.out.println(task8(3));
        System.out.println("----------------------------------------9-------------------------------------------------");

        System.out.println(task9(true));
        System.out.println(task9(false));
        System.out.println("----------------------------------------10-------------------------------------------------");

        System.out.println(task10(true));
        System.out.println(task10(false));
        System.out.println("----------------------------------------11-------------------------------------------------");

        System.out.println(task11(5));
        System.out.println(task11(0));
        System.out.println(task11(-3));
        System.out.println(task11(2));
        System.out.println("----------------------------------------12-------------------------------------------------");

        System.out.println(task12(5));
        System.out.println(task12(0));
        System.out.println(task12(-3));
        System.out.println(task12(2));
        System.out.println("----------------------------------------13-------------------------------------------------");

        System.out.println(task13(1, 3));
        System.out.println(task13(0, 6));
        System.out.println(task13(3, 5));
        System.out.println("----------------------------------------14-------------------------------------------------");

        System.out.println(task14(5));
        System.out.println(task14(7));
        System.out.println(task14(10));
        System.out.println(task14(14));
        System.out.println("----------------------------------------15-------------------------------------------------");

        System.out.println(task15(1));
        System.out.println("----------------------------------------FIBONACHI-------------------------------------------------");

        // Нормальний метод
        int result1 = fib(10);
        System.out.println("Нормальна реалізація: " + result1);

        // Не нормальний метод
        int result2 = fib2(10);
        System.out.println("Не нормальна реалізація(ріл не нормальна): " + result2);

    }

    // Задача 1
    static String task1(int a) {
        if (a == 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 2
    static String task2(int a) {
        if (a > 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 3
    static String task3(int a) {
        if (a < 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 4
    static String task4(int a) {
        if (a >= 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 5
    static String task5(int a) {
        if (a <= 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 6
    static String task6(int a) {
        if (a != 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 7
    static String task7(Object a) {
        if (a.equals("test")) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 8
    static String task8(Object a) {
        if (a.equals(1) && a.getClass() == Integer.class) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 9
    static String task9(boolean test) {
        if (test) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 10
    static String task10(boolean test) {
        if (!test) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 11
    static String task11(int a) {
        if (a > 0 && a < 5) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 12
    static int task12(int a) {
        if (a == 0 || a == 2) {
            return a + 7;
        } else {
            return a / 10;
        }
    }

    // Задача 13
    static int task13(int a, int b) {
        if (a <= 1 && b >= 3) {
            return a + b;
        } else {
            return a - b;
        }
    }

    // Задача 14
    static String task14(int a) {
        if ((a > 2 && a < 11) || (a >= 6 && a < 14)) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 15
    static String task15(int seasonCode) {
        String result;
        switch (seasonCode) {
            case 1:
                result = "зима";
                break;
            case 2:
                result = "весна";
                break;
            case 3:
                result = "лiто";
                break;
            case 4:
                result = "осiнь";
                break;
            default:
                result = "the END????";
                break;
        }
        return result;
    }
    //нормальна
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fibNumbers = new int[n+1];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
        }

        return fibNumbers[n];
    }

    // не нормальна
    public static int fib2(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib2(n - 1) + fib2(n - 2);
        }
    }



}
