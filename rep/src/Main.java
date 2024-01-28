public class Main {
    public static void main(String[] args) {
        int val = 5;
        int[] arr = {-1,-3,-5,-4};
        int[] arr2 = {11,3,5};
        max(222);

        findIndex(arr2,3);
        System.out.println("fffff");
        findIndex(arr,-4);
        print();
        print2();
        print3();
        print4();
    }
    public static void findIndex(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {

           if(arr[i]==target){
               System.out.println(arr[i]);
               System.out.println(i);
           }

        }
    }
    public static void max(int num){//
        String s = "";
        String[] base1 = {"","one","two","","","","","","","nine"} ;
        String[] base2 = {"","","twenty","","","","","","","ninety"} ;
        String[] base3 = {"","eleven","","","","","","","","nineteen"} ;
        String[] base4 = {"","eleven","","","","","","","","nineteen"} ;

        if (num>0 && num<10)
            s=base1[num];
        else if (num>19 && num<100)
            s=base2[num/10]+" "+base1[num%10];
        else if(num<1000 && num>100)
            s=base1[num/100]+" hundred "+ base2[num%10]+" "+base1[num%10];

        else
            s=base3[num%10];


        System.out.println(s);

    }
    /*public static void print(){//

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x==y || 9-x==y  || y==9 || y==0 || x==9 || x==0)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();


        }


    }
   }*/
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
