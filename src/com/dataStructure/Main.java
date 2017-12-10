package com.dataStructure;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dynamicarray a = new Dynamicarray();
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
        }

        
    }
}
