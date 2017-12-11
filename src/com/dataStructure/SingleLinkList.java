package com.dataStructure;

class Node {
    Node next = null;
    int data;

    public Node(int data){
        this.data = data;
    }


}
public class SingleLinkList {
    Node head;
    int size;

    public SingleLinkList(){
        this.size = 0;
        this.head = null;
    }

    public void appendToTail(int data){
        Node newData = new Node(data);
        if(this.head == null){
            this.head = newData;
        }else{
            Node tmp = this.head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newData;
        }
    }

    public void appendToHead(int data){
        Node newData = new Node(data);
        if(this.head == null){
            this.head = newData;
        }else{
            Node tmp = this.head;
            this.head = newData;
            newData.next = tmp;
        }
    }

    public void printAll(){
        Node tmp = this.head;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }


}

/*
class Main{
    public static void main(String args[]) {
        SingleLinkList sl = new SingleLinkList();
        sl.appendToTail(1);
        sl.appendToTail(2);
        sl.appendToTail(3);
        sl.appendToHead(4);
        sl.printAll();
    }
}*/
