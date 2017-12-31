package com.dataStructure.LinkList;
import java.util.Collection;
import com.dataStructure.LinkList.SingleLinkList.SingleNode;
public class AlternateKNode {

    public static SingleNode alterKNode(SingleNode h, int k){
        System.out.println("Hello World!");
        SingleNode slowPtr = null;
        SingleNode fastPtr = h;
        SingleNode tmp = fastPtr;
        fastPtr = fastPtr.nextNode;
        int counter = 5;
        while(tmp!=null){
            while(tmp!=null && counter >= 0){
                tmp.nextNode = slowPtr;
                slowPtr = tmp;
                tmp = fastPtr;
                if(fastPtr!=null){
                    fastPtr = fastPtr.nextNode;
                }
                --counter;
            }
            //counter = k;

        }
        h = slowPtr;
        return h;
    }

    public static void main(String[] args){
        SingleLinkList sl = new SingleLinkList();
        sl.addToEnd(1);
        sl.addToEnd(2);
        sl.addToEnd(3);
        sl.addToEnd(4);
        sl.addToEnd(5);
        sl.addToEnd(6);
        sl.addToEnd(7);
        int k = 2;
        SingleNode newHead = alterKNode(sl.getHead(), k);
        sl.setHead(newHead);
        sl.printLinkList();

    }
}
