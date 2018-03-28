package com.dataStructure.dynamic.rodcutting;


public class BasicRodCut {
    private static final int MIN_VAL = -9999999;
    public static int cutRod(int[] price, int size){
        if(size <= 0) {
            return 0;
        }
        int q = MIN_VAL;
        for(int i=0; i<size; i++){
            q = Math.max(q, price[i] + cutRod(price, (size-i-1)));
        }
        return q;
    }

    public static void main(String[] args) {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int size = 10;
        System.out.println("Maximum Obtainable Value is "+ cutRod(arr, size));

    }
}
