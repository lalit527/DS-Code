package com.dataStructure;

import java.util.*;

class StackNode<T>{
    T data ;
    StackNode<T> next;
    public StackNode(T data){
        this.data = data;
        this.next = null;
    }

}
public class Stack <T> {

    private int size;
    private StackNode<T> top;

    public Stack(){
        this.size = 0;
        this.top = null;
    }

    public void push(T data){

        StackNode<T> t = new StackNode<T>(data);
        t.next = top;
        top = t;
        ++this.size;
    }

    public T pop(){
        /*if(top==null){
            throw new EmptyStackException();
        }*/
        T tmp = top.data;
        top = top.next;
        --this.size;
        return tmp;
    }
}

class Mai{
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
