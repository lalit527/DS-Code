package com.dataStructure.Array;


public class StringCompare {

    public boolean compareSTring(String str1, String str2) {
        int[] letter = new int[128];
        for(int i=0; i<letter.length; i++){
            letter[i] = 0;
        }
        char[] str1_arr = str1.toCharArray();
        for(char c : str1_arr){
            ++letter[c];
        }
        char[] str2_arr = str2.toCharArray();
        for(int i=0; i<str2_arr.length; i++){
            --letter[str2_arr[i]];

        }
        for(int i=0; i<letter.length; i++){
            if(letter[i] > 0 || letter[i] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "Hexllo";
        String t = "Hello";

        StringCompare dp = new StringCompare();
        boolean result = dp.compareSTring(s, t);
        System.out.println(result);

    }
}
