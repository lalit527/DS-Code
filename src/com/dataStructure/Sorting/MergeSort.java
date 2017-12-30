package com.dataStructure.Sorting;

public class MergeSort {

    public static void merge(int[] arr, int first, int mid, int last){
        int left = 0;
        int right = 0;
        int[] leftArr = new int[mid-first+1];
        int[] rightArr = new int[last - mid];
        for(int i=first; i<=mid; i++){
            leftArr[left] = arr[i];
            ++left;
        }
        for(int j=mid+1; j<=last; j++){
            rightArr[right] = arr[j];
            ++right;
        }

        int n1 = mid-first+1;
        int n2 = last - mid;
        int i = 0;
        int j = 0;
        int k = first;

        while(i < n1 && j < n2){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                ++i;
                ++k;
            }else if(leftArr[i] > rightArr[j]){
                arr[k] = rightArr[j];
                ++j;
                ++k;
            }
        }

        while(i<n1){
            arr[k] = leftArr[i];
            ++i;
            ++k;
        }

        while(j<n2){
            arr[k] = rightArr[j];
            ++j;
            ++k;
        }

    }
    public static void mergeSortHelper(int[] arr, int first, int last){
        if(first < last){
            int mid = (first+last)/2;
            mergeSortHelper(arr, first, mid);
            mergeSortHelper(arr, mid+1, last);
            merge(arr, first, mid, last);
        }

    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        mergeSortHelper(arr, 0, n-1);
    }

    public static void main(String args[]) {
        int[] arr = {7, 5, 2, 6, 1, 3};
        mergeSort(arr);
        for(int i: arr){
            System.out.println(i);
        }

    }
}
