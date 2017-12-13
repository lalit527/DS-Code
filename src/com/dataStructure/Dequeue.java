package com.dataStructure;


public class Dequeue<T> {

        private int size;
        private QueueNode<T> head;
        private QueueNode<T> tail;

        class QueueNode<T>{
            T data ;
            QueueNode<T> next;
            public QueueNode(T data){
                this.data = data;
                this.next = null;
            }
        }

        public Queue(){
            this.size = 0;
            this.head = null;
            this.tail = null;
        }

        public void insert(T data){

            QueueNode<T> t = new QueueNode<T>(data);
            if(tail != null){
                tail.next = t;
            }
            tail = t;

            if(head == null){
                this.head = this.tail;
            }
            ++this.size;
        }

        public T remove() {

            T tmp = head.data;
            head = head.next;
            if(head == null){
                tail = null;
            }
            --this.size;
            return tmp;
        }
    }

    class Maiy{
        public static void main(String args[]) {
            com.dataStructure.Queue<Integer> q = new com.dataStructure.Queue<>();
            q.insert(1);
            q.insert(2);
            System.out.println(q.remove());
            System.out.println(q.remove());
        }
    }

}
