package com.dataStructure;

class DoubleNode {
    DoubleNode next = null;
    DoubleNode prev = null;
    int data;

    public DoubleNode(int data){
        this.data = data;
    }

}


public class DoubleLinkList {
    DoubleNode head;
    DoubleNode tail;
    int size;

    public DoubleLinkList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void appendToTail(int data){
        DoubleNode newData = new DoubleNode(data);
        if(this.head == null){
            this.head = newData;
            this.tail = newData;
        }else{
            DoubleNode tmp = this.tail;
            this.tail = newData;
            tmp.next = newData;
            newData.prev = tmp;
        }
        ++this.size;
    }

    public void appendToHead(int data){
        DoubleNode newData = new DoubleNode(data);
        if(this.head == null){
            this.head = newData;
            this.tail = newData;
        }else{
            DoubleNode tmp = this.head;
            this.head = newData;
            tmp.prev = newData;
            newData.next = tmp;
        }
        ++this.size;
    }

    public void printForward(){
        DoubleNode tmp = this.head;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public void printBackward(){
        DoubleNode tmp = this.tail;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.prev;
        }
    }


}

class Mainx{
    public static void main(String args[]) {
        DoubleLinkList sl = new DoubleLinkList();
        sl.appendToTail(1);
        sl.appendToTail(2);
        sl.appendToTail(3);
        sl.appendToHead(4);
        sl.printForward();
        sl.printBackward();
    }
}
