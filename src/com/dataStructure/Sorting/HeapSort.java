package com.dataStructure.Sorting;

public class HeapSort {
    public static void maxHeapify(int[] a, int n, int index){
        int left = 2*index + 1;
        int right = 2*index + 2;
        int largest = index;
        //System.out.println(left);
        //System.out.println(right);
        //System.out.println(index);
        //System.out.println(n);
        if(left < n && a[left] > a[largest]){
            largest = left;
        }
        if(right<n && a[right] > a[largest]){
            largest = right;
        }
        if(largest != index){
            int tmp = a[index];
            a[index] = a[largest];
            a[largest] = tmp;

            maxHeapify(a, n, largest);
        }
    }

    public static void buildMaxHeap(int[] arr){
        int n = arr.length;
        for(int i= n/2-1; i>=0; i--){
            maxHeapify(arr, n, i);
        }
    }

    public static void heapSort(int[] arr){
        buildMaxHeap(arr);
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            maxHeapify(arr, i, 0);
        }
    }


    public static void main(String args[]) {
        int[] arr = {7, 5, 2, 6, 1, 3, 4, 9};
        heapSort(arr);
        for(int i: arr){
            System.out.println(i);
        }

    }
}
