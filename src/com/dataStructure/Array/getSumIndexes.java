package com.dataStructure.Array;
import java.util.*;

public class getSumIndexes {
    public static int[] getIndexes(int[] arr, int sum) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<arr.length-2; i++){

            if(arr[i] + arr[i+1] + arr[i+2] == sum) {
                result.add(i);
                result.add(i+1);
                result.add(i+2);
            }
        }
        int[] ret = new int[result.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = result.get(i).intValue();
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3 ,10, 5};
        int sum = 33;
        int[] result = getIndexes(arr, sum);
        if(result.length > 0) {
            for(int i=0; i< result.length; i++){
                System.out.println(result[i]);
            }
        }else{
            System.out.println("No Data");
        }
    }
}
