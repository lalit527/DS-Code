package com.dataStructure;

import java.util.ArrayList;

class HashNode<K, V>{
      K key;
      V value;

      HashNode<K, V> next;

      public HashNode(K key, V value){
          this.key = key;
          this.value = value;
      }
}

public class Hashing<K, V> {
     private ArrayList<HashNode<K, V>> bucket;
     private int bucketCapacity;
     private int bucketSize;

     public Hashing(){
         this.bucketCapacity = 10;
         this.bucketSize = 2;
         this.bucket = new ArrayList<>();
     }

     public int getBucketSize(){
         return this.bucketSize;
     }

     public int getBucketCapacity(){
         return this.bucketCapacity;
     }

     public boolean isEmpty(){
         return this.bucketSize == 0;
     }

     public boolean isFull(){
         return this.bucketSize == this.bucketCapacity;
     }




}
