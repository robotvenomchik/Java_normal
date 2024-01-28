package Homework4;

public class Main {
    public static void main(String[] args) {
        max(1000);
        max(4560);
        max(7907);

        /*one thousand
        four thousand five hundred sixty
        seven thousand nine hundred  seven
        */

        print();
        print2();
        print3();
        print4();

    }
    public static void max(int num) {
        String s = "";
        String[] base1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] base2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] base3 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        if (num > 0 && num < 10)
            s = base1[num];
        else if (num > 10 && num < 20)
            s = base3[num % 10];
        else if (num > 19 && num < 100)
            s = base2[num / 10] + " " + base1[num % 10];
        else if (num < 1000 && num > 100)
            s = base1[num / 100] + " hundred " + base2[(num / 10) % 10] + " " + base1[num % 10];
        else if (num >= 1000 && num < 10000 && num % 1000 == 0)
            s = base1[num / 1000] + " thousand";
        else if (num < 10000 && num >= 1000)
            s = base1[num / 1000] + " thousand " + base1[(num / 100) % 10] + " hundred " + base2[(num / 10) % 10] + " " + base1[num % 10];
        else if (num < 100000 && num >= 10000)
            s = base2[num / 10000] + " " + base1[(num / 1000) % 10] + " thousand " + base1[(num / 100) % 10] + " hundred " + base2[(num / 10) % 10] + " " + base1[num % 10];
        else if (num < 1000000 && num >= 100000)
            s = base1[num / 100000] + " hundred " + base2[(num / 10000) % 10] + " " + base1[(num / 1000) % 10] + " thousand " + base1[(num / 100) % 10] + " hundred " + base2[(num / 10) % 10] + " " + base1[num % 10];

        System.out.println(s);
    }
    public static void print(){//

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x == y && x >= 5 || 9 - x == y && x < 5 || y==9) {

                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();


        }
        System.out.println();


    }
    public static void print2(){//

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x==y && x>=5 ||  x==9 || 9-x==y && x>=5)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void print3(){//

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x==y && x<5 ||  y==0 || 9-x==y && x>=5)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void print4(){//

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x==y && x<5 ||  x==0 || 9-x==y && x<5)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

}
