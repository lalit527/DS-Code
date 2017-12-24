package com.dataStructure.Array;

public class StringCompress {
    public String compressString(String s){
        int counter = 0;
        StringBuilder compressed = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            ++counter;
            if(i+1 >= s.length() || (s.charAt(i) != s.charAt(i+1))){
                compressed.append(s.charAt(i));
                compressed.append(counter);
                counter = 0;
            }
        }
        return compressed.toString();
    }

    public static void main(String[] args){
        String s = "ab";

        StringCompress sc = new StringCompress();
        String result = sc.compressString(s);
        System.out.println(result);

    }
}
