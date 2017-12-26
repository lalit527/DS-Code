package com.dataStructure.Array;

public class PalindromePermutation {
    public static boolean isPalindromePerm(String s){
        int[] charFreq = buildCharFreq(s);
        return checkMaxOddChar(charFreq);

    }

    public static boolean checkMaxOddChar(int[] arr){
        boolean odd = false;
        for(int count: arr){
            if(count%2==1){
                if(odd){
                    return false;
                }
                odd = true;
            }
        }
        return true;
    }

    public static int getCharNumber(char c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a<=val && val<=z){
            return val - a;
        }else{
            return -1;
        }
    }

    public static int[] buildCharFreq(String s){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : s.toCharArray()){
            int num = getCharNumber(c);
            if(num!=-1){
                ++table[num];
            }
        }
        return table;
    }

    public static void main(String args[]) {
        String s = "Tact Coa";
        boolean result = isPalindromePerm(s);
        System.out.println(result);
    }
}
