
public class New_Main {

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
        System.out.println(firstLetter("f"));
        System.out.println(firstLetter("F"));
        System.out.println(firstLetter(""));
        System.out.println(firstLetter("1"));
        System.out.println(firstLetter(" "));
        System.out.println(firstLetter(null));
    }

    // Задача 1
    static String task1(Integer a) {
        if (a == null) {
            return "Невірно";
        }
        if (a == 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 2
    static String task2(Integer a) {
        if (a == null) {
            return "Невірно";
        }
        if (a > 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 3
    static String task3(Integer a) {
        if (a == null) {
            return "Невірно";
        }
        if (a < 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 4
    static String task4(Integer a) {
        if (a == null) {
            return "Невірно";
        }
        if (a >= 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 5
    static String task5(Integer a) {
        if (a == null) {
            return "Невірно";
        }
        if (a <= 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 6
    static String task6(Integer a) {
        if (a == null) {
            return "Невірно";
        }
        if (a != 0) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 7
    static String task7(Object a) {
        if (a == null) {
            return "Невірно";
        }
        if (a.equals("test")) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 8
    static String task8(Object a) {
        if (a == null) {
            return "Невірно";
        }
        if (a.equals(1) && a.getClass() == Integer.class) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 9
    static String task9(Boolean test) {
        if (test == null) {
            return "Невірно";
        }
        if (test) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 10
    static String task10(Boolean test) {
        if (test == null) {
            return "Невірно";
        }
        if (!test) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 11
    static String task11(Integer a) {
        if (a == null) {
            return "Невірно";
        }
        if (a > 0 && a < 5) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 12
    static Integer task12(Integer a) {
        if (a == null) {
            return 0;
        }
        if (a == 0 || a == 2) {
            return a + 7;
        } else {
            return a / 10;
        }
    }

    // Задача 13
    static Integer task13(Integer a, Integer b) {
        if (a == null || b == null) {
            return 0;
        }
        if (a <= 1 && b >= 3) {
            return a + b;
        } else {
            return a - b;
        }
    }

    // Задача 14
    static String task14(Integer a) {
        if (a == null) {
            return "Невірно";
        }
        if ((a > 2 && a < 11) || (a >= 6 && a < 14)) {
            return "Вірно";
        } else {
            return "Невірно";
        }
    }

    // Задача 15
    static String task15(Integer seasonCode) {
        if (seasonCode == null) {
            return "Невірно";
        }
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
    public static int fib(Integer n) {
        if (n == null) {
            return 0;
        }
        if (n <= 1) {
            return n;
        }

        int[] fibNumbers = new int[n + 1];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }

        return fibNumbers[n];
    }

    // не нормальна
    public static int fib2(Integer n) {
        if (n == null) {
            return 0;
        }
        if (n <= 1) {
            return n;
        } else {
            return fib2(n - 1) + fib2(n - 2);
        }
    }
    public static boolean firstLetter(String s){
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        int m= s.codePointAt(0);

        if(m>64 && m<91) {
            return true;
        }
        return false;

    }
    }


