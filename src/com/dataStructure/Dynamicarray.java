package com.dataStructure;
import java.lang.Exception;

public class Dynamicarray {
    private static final int INCREASE_FACTOR = 2;
    private int capacity;
    private int count;
    private Object[] data;

    public Dynamicarray() {
        /*System.out.println("Hello Again");*/
        this.capacity = 1;
        this.count = 0;
        this.data = new Object[this.capacity];
    }

    public int getLength(){
        return  this.count;
    }

    public void addElement(Object obj){
        if(this.capacity == this.count){
            increaseSize(obj);
        }
        this.data[this.count] = obj;
        ++this.count;
    }

    public void increaseSize(Object obj){
        this.capacity = INCREASE_FACTOR * this.capacity;
        Object tmpData[] = new Object[this.capacity];
        for (int i=0; i<this.count; i++) {
             tmpData[i] = this.data[i];
        }
        this.data = tmpData;

    }

    public int getCapacity(){
        return this.capacity;
    }

    public Object getElement(int index) throws Exception{
        if (index >=count || index < 0){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return this.data[index];
    }


}
