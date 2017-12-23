package com.dataStructure.Array;

/**
 *
 * Class to create Jagged Array
 * 1st Row of Array will have 1 column, 2nd row will have 2 and so on.
 * creating
 */
public class JaggedArray {


    public static void main(String[] args){
        int rows = 4;
        int arr[][]= new int[rows][];
        for(int i=0; i<rows; i++){
            arr[i] = new int[i+1];
        }

        int counter = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j< arr[i].length; j++){
                arr[i][j] = ++counter;
            }
        }

        for(int i=0; i<arr.length;i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    /*for(int i=0; i<rows; i++){
        a[i] = new int[i+1];
    }*/

}

