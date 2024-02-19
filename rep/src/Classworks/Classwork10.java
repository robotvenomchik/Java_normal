package Classworks;

public class Classwork10 {
    public static void main(String[] args) {
        int a=34;
        char c = (char) a;
        System.out.println(c);
        System.out.println(setName2("Pepa pig ate puncake"));
    }
    public static boolean setName(String name){
        int code=name.codePointAt(0);
        if(code>=60 && code<=90) System.out.println("Okay");
        else System.out.println("no");
        return false;
    }
    public static String setName2(String name){
        String[] ar = name.split(" ");
        String max ="k";
        for (int i=0; i<ar.length; i++){
            if (ar[i].length()>max.length()){
                max=ar[i];
            }
        }


//        ar[0].length()

        return max;
    }
}
