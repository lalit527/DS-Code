package com.dataStructure.LinkList;
import java.util.Stack;
public class SingleLinkList {
    private SingleNode head;
    private SingleNode tail;
    Stack<Integer> st = new Stack<>();

    class SingleNode{
        private int data;
        private SingleNode nextNode;

        public SingleNode(int data){

            this.data = data;
            this.nextNode = null;
        }
    }

    public SingleLinkList(){

        this.head = null;
        this.tail = null;

    }

    public void addToStart(int data){
        SingleNode newNode = new SingleNode(data);
        if(this.head == null){
            this.tail = newNode;
        }
        SingleNode tmp = head;
        this.head = newNode;
        newNode.nextNode = tmp;
    }

    public void addToEnd(int data){
        SingleNode newNode = new SingleNode(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            SingleNode tmp = this.tail;
            tmp.nextNode = newNode;
            this.tail = newNode;
        }
    }

    public void printLinkList(){
        SingleNode tmp = this.head;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp = tmp.nextNode;
        }
    }

    /***
     * find middle of the link list
     *
     **/
    public SingleNode findMiddleNode(){
        SingleNode slowPtr = this.head;
        SingleNode fastPtr = this.head;
        while(fastPtr!=null && fastPtr.nextNode!=null){
            fastPtr = fastPtr.nextNode.nextNode;
            slowPtr = slowPtr.nextNode;
        }
        return slowPtr;
    }

    /***
     * find kth node of the link list
     *
     **/
    public SingleNode findKNode(int k){
        SingleNode slowPtr = this.head;
        SingleNode fastPtr = this.head;
        while(k>=0 && fastPtr!=null){
            fastPtr = fastPtr.nextNode;
            --k;
        }
        if(k>0){
            return null;
        }
        while(fastPtr!=null){
            fastPtr = fastPtr.nextNode;
            slowPtr = slowPtr.nextNode;
        }
        return slowPtr;
    }

    /***
     * find kth node of the link list
     *
     **/
    public void reverseList(){
        SingleNode slowPtr = null;
        SingleNode fastPtr = this.head;
        SingleNode tmp = fastPtr;
        fastPtr = fastPtr.nextNode;
        while(tmp!=null){
            tmp.nextNode = slowPtr;
            slowPtr = tmp;
            tmp = fastPtr;
            if(fastPtr!=null){
                fastPtr = fastPtr.nextNode;
            }

        }
        //tmp.nextNode = slowPtr;
        //slowPtr = tmp;
        this.head = slowPtr;
        System.out.println("Done");
    }

    public SingleNode reverseList(SingleNode h){
        SingleNode slowPtr = null;
        SingleNode fastPtr = h;
        SingleNode tmp = fastPtr;
        fastPtr = fastPtr.nextNode;
        while(tmp!=null){
            tmp.nextNode = slowPtr;
            slowPtr = tmp;
            tmp = fastPtr;
            if(fastPtr!=null){
                fastPtr = fastPtr.nextNode;
            }

        }
        h = slowPtr;
        return h;
    }

    public int findSize(SingleNode start){
        int size = 0;
        SingleNode tmp = start;
        while(tmp!=null){
            ++size;
            tmp=tmp.nextNode;
        }
        return size;
    }
    public boolean checkPalinHelper(SingleNode f, SingleNode s){
        while(f!=null || s!=null){
            //System.out.println("f"+f.data);
            //System.out.println("s"+s.data);
            if(f.data != s.data){
                return false;
            }
            f = f.nextNode;
            s = s.nextNode;
        }
        return true;
    }

    public boolean checkPalin(){
        SingleNode tmp = this.head;
        SingleNode middle =  findMiddleNode();
        SingleNode firstHead = this.head;
        SingleNode nextHead = null;
        boolean result = true;
        int size = findSize(tmp);
        boolean check = true;
        if(size%2==0){
            SingleNode firstEnd = this.head;
            while(firstEnd.nextNode!=middle){
                firstEnd = firstEnd.nextNode;
            }
            firstEnd.nextNode = null;

            nextHead = middle;
            SingleNode nextHeadRev = reverseList(nextHead);
            result = checkPalinHelper(this.head, nextHeadRev);
            nextHeadRev = reverseList(nextHeadRev);
            firstEnd.nextNode = nextHeadRev;
        }else{
            SingleNode firstEnd = this.head;
            while(firstEnd.nextNode!=middle){
                firstEnd = firstEnd.nextNode;
            }
            firstEnd.nextNode = null;
            nextHead = middle.nextNode;
            SingleNode nextHeadRev = reverseList(nextHead);
            result = checkPalinHelper(this.head, nextHeadRev);
            nextHeadRev = reverseList(nextHeadRev);
            firstEnd.nextNode = middle;
            middle.nextNode = nextHeadRev;
        }



        System.out.println(middle.data);
        return result;
    }

    public boolean checkPalinSt(){
        SingleNode tmp = this.head;
        while(tmp!=null) {
            st.push(tmp.data);
            tmp = tmp.nextNode;
        }
        tmp = this.head;
        while(tmp!=null){

            if(tmp.data!=st.pop()){
                return false;
            }
            tmp=tmp.nextNode;
        }
        return true;
    }

    public static void main(String[] args) {
        SingleLinkList sn = new SingleLinkList();
        sn.addToEnd(1);
        sn.addToEnd(2);
        sn.addToEnd(3);
        sn.addToEnd(4);
        sn.addToEnd(3);
        sn.addToEnd(2);
        sn.addToEnd(1);
        //sn.printLinkList();
        //SingleNode middle = sn.findMiddleNode();
        //SingleNode kNode = sn.findKNode(2);
        //sn.reverseList();
        //System.out.println(sn.checkPalin());
        System.out.println(sn.checkPalinSt());
        sn.printLinkList();
    }

}
