package Homework1;

import Homeworks.Homework12.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       wash("wool", 5, 60);
       wash("wool", 5, 60);
       wash("wool", 5 , 60);

    }
    public static void wash(String type,int time, int temperature) {
       System.out.println("Turning on...");
       System.out.println("Wash on " + type + " for " + time +" minutes " +" TEMPERATURE "+ temperature);
       System.out.println("Ready....  Turning off....");
    }
    public static void wash2(String type, int time, int temperature) {
        System.out.println("Turning on...");
        System.out.println("Wash on " + type + " for " + time + " minutes " + " TEMPERATURE " + temperature);
        System.out.println("Ready.... Turning off....");
    }



}