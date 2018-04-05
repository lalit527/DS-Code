package com.dataStructure.dynamic.rodcutting;

public class BottomUpRodCut {
    private static final int MIN_VAL = -9999999;
    public static int memoRodCut(int[] price, int size){
        int result[] = new int[size+1];
        result[0] = 0;
        for(int i=1; i<=size; i++){
            int q = MIN_VAL;
            for(int j=0; j<i; j++){
                q = Math.max(q, price[j] + result[i-j-1]);
            }
            result[i] = q;
        }
        return result[size];
    }

    public static void main(String[] args) {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int size = 1;
        System.out.println("Maximum Obtainable Value is "+ memoRodCut(arr, size));

    }
}
