package Homeworks;

import java.util.*;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("-------------    --------1---------       --------------");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(8,3,1,4,1,3,9));
        System.out.println("List from smallest to bigest >>> " + sortListFromZero(numbers));
        System.out.println("List from bigest to smallest >>> " + sortListToZero(numbers));
        System.out.println("-------------    --------2---------       --------------");
        List<String> strings = new ArrayList<>(Arrays.asList("pepa","pepa pig", "pepa", "pepa cow"));
        System.out.println("no duplicates >>> " + removeDuplicates(strings));
        System.out.println("-------------    --------3---------       --------------");

        System.out.println("min number >>> " + findMin(numbers));
        System.out.println("max number >>> " + findMax(numbers));
        System.out.println("-------------    ---------4--------       --------------");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,8,9,10));
        System.out.println("Merged array >>> " + mergeLists(list1, list2));
        System.out.println("-------------    ---------5--------       --------------");

        List<String> fruits = List.of("apple", "orange", "banana");
        String elementToFind = "banana";
        System.out.println(checkElement(fruits, elementToFind));
        elementToFind = "watermelon";
        System.out.println(checkElement(fruits, elementToFind));
    }

    private static List<Integer> sortListFromZero(List<Integer> numbers) {
        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);
        return sortedList;
    }

    private static List<Integer> sortListToZero(List<Integer> numbers) {
        List<Integer> sortedList = new ArrayList<>(numbers);
        sortedList.sort(Collections.reverseOrder());
        return sortedList;
    }

    private static List<String> removeDuplicates(List<String> strings) {
        HashSet<String> uniqueStrings = new HashSet<>(strings);
        return new ArrayList<>(uniqueStrings);
    }

    private static int findMax(List<Integer> numbers) {
        return Collections.max(numbers);
    }
    private static int findMin(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    private static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        HashSet<Integer> uniqueNumbers = new HashSet<>(mergedList);
        return new ArrayList<>(uniqueNumbers);
    }

    private static String checkElement(List<String> strings, String elementToFind) {
        if (strings.contains(elementToFind)) {
            return elementToFind + " is here";
        } else {
            return elementToFind + " isn't here";
        }
    }
}
