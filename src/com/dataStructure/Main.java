package com.dataStructure;



public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Dynamicarray a = new Dynamicarray();
        a.addElement("1");
        a.addElement("2");
        a.addElement("3");
        a.addElement("4");
        a.addElement("5");
        System.out.println(a.getLength());
        System.out.println(a.getCapacity());
        try{
            System.out.println(a.getElement(5));
        }catch(Exception e){
            System.out.println("Exception Occured"+e);
        }*/

        /*Hashing<Integer, String> hashmap = new Hashing<>();
        hashmap.addElement(1, "Data1");
        hashmap.addElement(11, "Data2");

        System.out.println(hashmap.getBucketSize());

        System.out.println(hashmap.get(11));*/

        SingleLinkList sl = new SingleLinkList();
        sl.appendToTail(1);
        sl.appendToTail(2);
        sl.appendToTail(3);
        sl.appendToHead(4);
        sl.printAll();


    }
}
