package com.dataStructure.Array;

public class kthsmallest {
    public static int getkthSmallest(int[] arr, int smallest) {
        int length = arr.length;
        return getkthSmallestHelper(arr, 0, length-1, smallest);
    }

    public static int getkthSmallestHelper(int[] arr, int start, int end, int smallest) {
        if(start > end){
            return -1;
        }else{
            int i = start;
            int j = end-1;
            int pivot = end;
            while (i <= j) {
                while(i <= end && arr[i] < arr[pivot]){
                    ++i;
                }
                while(j>=0 && arr[j] > arr[pivot]){
                    --j;
                }
                if(i<j){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            int tmp = arr[j+1];
            arr[j+1] = arr[pivot];
            arr[pivot] = tmp;
            pivot = j+1;
            if(pivot == smallest-1){
                return arr[pivot];
            }else if(pivot > smallest-1){
                return getkthSmallestHelper(arr, start, pivot-1, smallest);
            }else{
                return getkthSmallestHelper(arr, pivot+1, end, smallest);
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 2, 3 ,7, 5};
        int smallest = 4;
        int result = getkthSmallest(arr, smallest);
        System.out.println(result);
    }
}
