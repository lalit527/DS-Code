package com.dataStructure.dynamic.rodcutting;

public class TopDownRodCut {
    private static final int MIN_VAL = -9999999;
    public static int memoRodCut(int[] price, int size){
        int[] result = new int[size];
        for(int i=0; i<size; i++){
            result[i] = MIN_VAL;
        }

        return memoRodCut(price, size, result);
    }

    private static int memoRodCut(int[] price, int size, int[] result){
        if(size<=0){
            return 0;
        }
        int q = MIN_VAL;
        if(result[size-1] >= 0) {
            return result[size-1];
        }else{
            for(int i=0; i<size; i++){
                q = Math.max(q, price[i] + memoRodCut(price, size-i-1, result));
            }

        }
        result[size-1] = q;
        return q;

    }

    public static void main(String[] args) {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int size = 8;
        System.out.println("Maximum Obtainable Value is "+ memoRodCut(arr, size));

    }
}
