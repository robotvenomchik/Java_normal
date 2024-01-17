public class New_Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------1-------------------------------------------------");

        task1(1);
        task1(0);
        task1(-3);
        System.out.println("----------------------------------------2-------------------------------------------------");
        task2(1);
        task2(0);
        task2(-3);
        System.out.println("----------------------------------------3-------------------------------------------------");

        task3(1);
        task3(0);
        task3(-3);
        System.out.println("----------------------------------------4-------------------------------------------------");

        task4(1);
        task4(0);
        task4(-3);
        System.out.println("----------------------------------------5-------------------------------------------------");

        task5(1);
        task5(0);
        task5(-3);
        System.out.println("----------------------------------------6-------------------------------------------------");

        task6(1);
        task6(0);
        task6(-3);
        System.out.println("----------------------------------------7-------------------------------------------------");

        task7("test");
        task7("тест");
        task7(3);
        System.out.println("----------------------------------------8-------------------------------------------------");

        task8(1);
        task8(3);
        System.out.println("----------------------------------------9-------------------------------------------------");

        task9(true);
        task9(false);
        System.out.println("----------------------------------------10-------------------------------------------------");

        task10(true);
        task10(false);
        System.out.println("----------------------------------------11-------------------------------------------------");

        task11(5);
        task11(0);
        task11(-3);
        task11(2);
        System.out.println("----------------------------------------12-------------------------------------------------");

        task12(5);
        task12(0);
        task12(-3);
        task12(2);
        System.out.println("----------------------------------------13-------------------------------------------------");

        task13(1, 3);
        task13(0, 6);
        task13(3, 5);
        System.out.println("----------------------------------------14-------------------------------------------------");

        task14(5);
        task14(7);
        task14(10);
        task14(14);
        System.out.println("----------------------------------------15-------------------------------------------------");

        System.out.println(task15(1));
    }

    // Задача 1
    static void task1(int a) {
        if (a == 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    // Задача 2
    static void task2(int a) {
        if (a > 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    // Задача 3
    static void task3(int a) {
        if (a < 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    // Задача 4
    static void task4(int a) {
        if (a >= 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    // Задача 5
    static void task5(int a) {
        if (a <= 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    // Задача 6
    static void task6(int a) {
        if (a != 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    // Задача 7
    static void task7(Object a) {
        if (a.equals("test")) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    // SADACHA 8
    static void task8(Object a) {
        if (a.equals(1) && a.getClass() == Integer.class) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }
    // Задача 9 дуууууууууууууууужжжжжжжжжжжжжжееееееееееее коооооооооооооооорррррррррроооооооотттттттттттккккккккккккоооооооооооо

    static void task9(boolean test) {
        String result = test ? "Вірно" : "Невірно";
        System.out.println(result);
    }

    // Задача 9 нормально
    // static void task9(boolean test) {
    //     if (test) {
    //         System.out.println("Вірно");
    //     } else {
    //         System.out.println("Невірно");
    //     }
    // }

    // Задача 10 (дууууууууууууууужееееееееееее коротко
    static void task10(boolean test) {
        String result = !test ? "Вірно" : "Невірно";
        System.out.println(result);
    }

    // Задача 10 нормально
    // static void task10(boolean test) {
    //     if (!test) {
    //         System.out.println("Вірно");
    //     } else {
    //         System.out.println("Невірно");
    //     }
    // }
    // Хадача 11
    static void task11(int a) {
        if (a > 0 && a < 5) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    // Задача 12
    static void task12(int a) {
        int result = (a == 0 || a == 2) ? a + 7 : a / 10;
        System.out.println(result);
    }

    // Задача 13
    static void task13(int a, int b) {
        if (a <= 1 && b >= 3) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }

    // Задача 14
    static void task14(int a) {
        if ((a > 2 && a < 11) || (a >= 6 && a < 14)) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }
    //task15
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
}
