import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        String inputText = "hello world";
        String inputTextPalindrome = "did";

        String reversedText = reversetext(inputText);
        System.out.println("reversed text: " + reversedText);

        int golosni = countGolosni(inputText);
        System.out.println("Golosni: " + golosni);

        boolean isPalindrom = isPalindrome(inputText);
        System.out.println("is palindrome: " + isPalindrom);

        boolean isPalindrom2 = isPalindrome(inputTextPalindrome);
        System.out.println("is palindrome: " + isPalindrom2);

        String withoutDuplicates = removeDuplicates(inputText);
        System.out.println("non duplicates: " + withoutDuplicates);

        String[] wordArray = convertToArray(inputText);
        System.out.println("arr: " + Arrays.toString(wordArray));
    }
    
    //1
    public static String reversetext(String inputStr) {
        return new StringBuilder(inputStr).reverse().toString();
    }

    // 2
    public static int countGolosni(String inputStr) {
        int count = 0;
        String golosni = "aeiouAEIOU";

        for (char ch : inputStr.toCharArray()) {
            if (golosni.contains(String.valueOf(ch))) {
                count++;
            }
        }

        return count;
    }

    // 3
    public static boolean isPalindrome(String inputStr) {
        String reversed = new StringBuilder(inputStr).reverse().toString();
        return inputStr.equalsIgnoreCase(reversed);
    }

    // 4
    public static String removeDuplicates(String inputStr) {
        StringBuilder result = new StringBuilder();
        for (char ch : inputStr.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // 5
    public static String[] convertToArray(String inputStr) {
        return inputStr.split(" ");
    }
}

