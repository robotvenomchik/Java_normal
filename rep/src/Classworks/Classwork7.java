package Classworks;

import java.util.Arrays;

public class Classwork7 {
    public static void main(String[] args) {
        int [] arr={2,4,1,3};
        sort(arr);
        selectSort(arr);
        bubbleSort(arr);
        printArray(arr);
        twoSum(arr, 5);
    }
    public static void selectSort(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i]<ar[j]){
                    int tmp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = tmp;
                }
            }
        }
    }
    public static void bubbleSort(int[] ar){
        for (int j = 0; j < ar.length; j++) {
            for (int i = 0; i < ar.length-1; i++) {
                if (ar[i]>ar[i+1]){
                    int tmp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = tmp;
                }
            }
        }
    }

    public static void sort(int[] ar){
        for(int i=0; i< ar.length; i++){
            for (int j=i+1; j< ar.length; j++){
                if(ar[i]> ar[j]){
                    int tmp=ar[j];
                    ar[j]=ar[i];
                    ar[i]=tmp;
                }
            }
        }
    }
    public static void twoSum(int[] nums, int target){
        for (int i=0; i<nums.length-1; i++){
            for (int j=1+i; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    System.out.println(nums[i] + " " + nums[j]);
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
