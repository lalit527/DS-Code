package com.dataStructure.Array;
import java.util.*;

public class StackReverse {

    public static void reverseStack(Stack<Integer> st) {
        List<Integer> al = new ArrayList<Integer>();
        int eleCount = st.size();
        for(int i=0; i<eleCount; i++){
            al.add(st.pop());
        }
        reverseStackHelper(al, 0, eleCount-1);
        for(int itm: al){
            st.push(itm);
        }
    }
    public static void reverseStackHelper(List<Integer> arr, int first, int last) {
        if(first < last){
            int tmp = arr.get(first);
            arr.set(first, arr.get(last));
            arr.set(last, tmp);
            reverseStackHelper(arr, first+1, last-1);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(7);
        st.push(9);
        reverseStack(st);
        for(Integer item: st) {
            System.out.println(item);
        }
    }
}
