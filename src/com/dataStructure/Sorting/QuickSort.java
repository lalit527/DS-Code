package com.dataStructure.Sorting;

public class QuickSort {
    public static int partition(int[] a, int first, int last){
        int pivot = last;
        int low = first;
        int high = last-1;
        while(low <= high){
            while(a[low]<a[pivot]){
                ++low;
            }
            while(a[high] > a[pivot]){
                --high;
            }
            if(low<high){
                int tmp = a[low];
                a[low] = a[high];
                a[high] = tmp;
            }

        }
        int tmp = a[high+1];
        a[high+1] = a[pivot];
        a[pivot] = tmp;
        return high+1;

    }

    public static void quickSortHelper(int[] arr, int first, int last){
        if(first < last){
            int key = partition(arr, first, last);
            quickSortHelper(arr, first, key-1);
            quickSortHelper(arr, key+1, last);
        }
    }

    public static void quickSort(int[] arr){
        int n = arr.length;
        quickSortHelper(arr, 0, n-1);
    }

    public static void main(String args[]) {
        int[] arr = {7, 5, 2, 6, 1, 3};
        quickSort(arr);
        for(int i: arr){
            System.out.println(i);
        }

    }
}
