package com.dataStructure.Array;

public class WaveArray {

    public static void swap(int[] arr, int a, int b){
          int tmp = arr[a];
          arr[a] = arr[b];
          arr[b] = tmp;
    }
    public static void waveArray(int[] arr){
        for(int i=0; i<arr.length; i=i+2){
            if(i>0 && (arr[i-1]>arr[i])){
               swap(arr, i-1, i);
            }

            if(i<arr.length-2 && arr[i] < arr[i+1]){
                 swap(arr, i, i+1);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        waveArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
    }
}
