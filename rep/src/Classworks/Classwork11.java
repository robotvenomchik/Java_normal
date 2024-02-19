package Classworks;

public class Classwork11 {
    public static void main(String[] args) {
        String j="hello";
        System.out.println(reverse(j));
    }

    public static String reverse(String text){
        String reversedText="";
        for (int i= text.length()-1; i>-1; i--){
            reversedText+= text.charAt(i);
        }
        return reversedText;
    }
}
