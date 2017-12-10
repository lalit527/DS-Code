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
         this.bucketSize = 0;
         this.bucket = new ArrayList<>();

         for(int i=0; i<bucketCapacity; i++){
             this.bucket.add(null);
         }
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

     public int hashFunction(K key){
         int hashCode = key.hashCode();
         int index = hashCode % this.bucketCapacity;
         return index;
     }

     public void addElement(K key, V value){
         int index = hashFunction(key);
         HashNode<K, V> head = this.bucket.get(index);
         HashNode<K, V> tmp = head;
         if (head == null){
             HashNode<K, V> newNode = new HashNode<K, V>(key, value);
             newNode.next = null;
             this.bucket.add(index, newNode);
         }else{
             while(head.next != null){
                 head = head.next;
             }
             HashNode<K, V> newNode = new HashNode<K, V>(key, value);
             newNode.next = null;
             head.next = newNode;
             System.out.println("Chaining");
         }
         ++this.bucketSize;
     }

     public V get(K key){
         int index = hashFunction(key);
         HashNode<K, V> head = this.bucket.get(index);
         HashNode<K, V> tmp = head;

         if(head.key == key){
             return head.value;
         }else{
             System.out.println("Checking Chaining");
             System.out.println("Checking Chaining"+key);
             while(head != null){
                 System.out.println("Checking Chaining"+head.key);
                 if(head.key == key){
                     return head.value;
                 }
                 head = head.next;
             }
         }

         return null;
     }



}
