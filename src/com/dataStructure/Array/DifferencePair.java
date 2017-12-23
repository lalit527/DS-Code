package com.dataStructure.Array;


/**
 *
 * Difference of a pair
 * 1st Row of Array will have 1 column, 2nd row will have 2 and so on.
 * creating
 */
public class DifferencePair {
    public void diffSumDup(int[] arr, int k){
        boolean hash[] = new boolean[999];
        for (int i=0; i<hash.length;i++){
            hash[i] = false;
        }
        for(int i=0; i<arr.length; i++){
            hash[arr[i]] = true;
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i]<k){
                if(hash[arr[i]+k]){
                    System.out.println('('+Integer.toString(arr[i])+','+Integer.toString(arr[i]+k)+')');
                }
            }else{
                if(hash[arr[i]-k]){
                    System.out.println('('+Integer.toString(arr[i])+','+Integer.toString(arr[i]-k)+')');
                }
            }
        }
    }

    public void diffSumNoDup(int[] arr, int k){
        boolean hash[] = new boolean[999];
        for (int i=0; i<hash.length;i++){
            hash[i] = false;
        }
        for(int i=0; i<arr.length; i++){
            hash[arr[i]] = true;
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i]<k){
                if(hash[arr[i]+k]){
                    System.out.println('('+Integer.toString(arr[i])+','+Integer.toString(arr[i]+k)+')');
                    hash[arr[i]] = false;
                }
            }else{
                if(hash[arr[i]-k]){
                    System.out.println('('+Integer.toString(arr[i])+','+Integer.toString(arr[i]-k)+')');
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int k = 3;
        DifferencePair dp = new DifferencePair();
        dp.diffSumNoDup(arr, k);

    }
}
