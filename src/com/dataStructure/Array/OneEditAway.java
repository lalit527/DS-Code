package com.dataStructure.Array;

public class OneEditAway {

    public boolean oneEditAway(String first, String second){
        if(first.length() == second.length()){
            return oneReplaceAway(first, second);
        }else if(first.length()+1 == second.length()){
            return oneInsertAway(first, second);
        }else if(first.length() == second.length()+1){
            return oneInsertAway(second, first);
        }
        return false;
    }

    public boolean oneReplaceAway(String first, String second){
        boolean replace = false;
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                if(replace){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean oneInsertAway(String first, String second){
        boolean insert = true;
        int length1 = first.length();
        int length2 = second.length();
        int index1 = 0;
        int index2 = 0;
        while(index1 < length1 && index2 < length2){
            if(first.charAt(index1) != second.charAt(index2)){
                if(insert){
                    ++index1;
                    insert = false;
                }else{
                    return false;
                }

            }else{
                ++index1;
                ++index2;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "pale";
        String t = "bale";
        OneEditAway sc = new OneEditAway();
        boolean result = sc.oneEditAway(s, t);
        System.out.println(result);

    }
}
