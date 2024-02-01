import javax.naming.PartialResultException;

public class Classwork6 {
    public static void main(String[] args) {
        int[] ar={1,-3,4};
        int[][] ar1={{1,1,8},{1,1,1},{1,1,1}};
        int[][] ar2 ={
                {1, 2, 3},
                {4,5,6},
                {7,7,10}};
        //task1(ar, 5);
        //task2(ar1);
        //task3(ar1, 3);
        print(ar2);
        sumUp(ar2);
        sumRightLine(ar2);;
    }
    public static void task2(int[][] ar) {
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            for(int j=0; j<ar[i].length; j++)
                sum=sum+ar[i][j];
        }
        System.out.println(sum);
    }
    public static void task1(int[] ar, int num){
        boolean b=false;
        for (int i=0; i<ar.length; i++){
            if (ar[i]>num){
                System.out.println(ar[i]);

            }

            b=true;
        }
        if (b)
            System.out.println("none");
    }

    public static void task3(int[][] ar, int num){
        boolean b=false;
        outerloop:
        for (int i=0; i<ar.length; i++){
            for (int j=0; j<ar[i].length;j++){
                if (ar[i][j]>num){
                    System.out.println(ar[i][j]);
                    break outerloop;
                }
            }
            b=true;
        }
        if (b)
            System.out.println("none");
    }
    public static void sumRight(int[][] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i==j)
                    sum+=ar[i][j];

            }

        }
        System.out.println(sum);
    }
    public static void sumUp(int[][] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if(i==0){
                    System.out.println(ar[i][j]);
                    sum=sum+ar[i][j];
                }

            }

        }
        System.out.println(sum);
    }
    public static void sumRightLine(int[][] ar){
        int sum1 = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if(j == ar[i].length-1){
                    sum1=sum1+ar[i][j];
                }

            }

        }
        System.out.println(sum1);
    }
    public static void print(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
