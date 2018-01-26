package com.dataStructure.Array;

public class CommonElement {
    public static int getCommonEle(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;
        while(i < n1 || j < n2 || k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                return arr1[i];
            }else if(arr1[i] < arr2[j]){
                ++i;
            }else if(arr2[j] < arr3[k]) {
                ++j;
            }else{
                ++k;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        int arr1[] = {1, 5, 5};
        int arr2[] = {3, 4, 5, 5, 10};
        int arr3[] = {5, 5, 10, 20};
        int commonEle = getCommonEle(arr1, arr2, arr3);
        System.out.println(commonEle);
    }
}
