package Classworks;

public class Classwork8 {

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact2(5));
    }

    public static int fact(int num){
        int factorial = 1;
        for (int i = num ; i>=1 ; i--)
            factorial *= i;

        return factorial;
    }
    public static int fact2(int num){
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fact2(num - 1);
        }
    }

}


