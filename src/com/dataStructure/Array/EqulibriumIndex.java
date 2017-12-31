package com.dataStructure.Array;

public class EqulibriumIndex {
    public static int equlibrium(int[] arr){
        int sum = 0;
        int leftSum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        for(int i=0; i<arr.length; i++){
            sum -= arr[i];
            if(sum == leftSum){
               return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int index = equlibrium(arr);
        System.out.println(index);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
    }
}
