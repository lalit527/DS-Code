package com.dataStructure.Array;

public class Segregate01 {

    public static void segregateArr(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            while(arr[left] == 0){
                ++left;
            }
            while(arr[right] == 1){
                --right;
            }
            if(left<right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregateArr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
    }
}
