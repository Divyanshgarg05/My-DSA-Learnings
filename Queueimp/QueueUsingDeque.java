package Queueimp;
import java.util.*;
public class QueueUsingDeque {
    public class Queue{
        Deque<Integer> deque = new java.util.LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new QueueUsingDeque().new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove()); 
        System.out.println(q.remove());


    }
}
