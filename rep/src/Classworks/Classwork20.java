package Classworks;

import java.util.ArrayList;
import java.util.List;

public class Classwork20 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        for (int in:
             list) {
            if (in<90) System.out.println(in);
        }
        for(int i =0; i < list.size(); i++ ){
            int updatedNumber = list.get(i) + 10;
            list.set(i, updatedNumber);
        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
//знайти числа мньше за 90
//до кожного з них добавити 10
//вивести на экран перші 3
    }
}
