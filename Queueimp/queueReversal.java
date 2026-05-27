package Queueimp;
import java.util.*;
public class queueReversal {

    public static Queue reverse(Queue q){
        Stack s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove()) ;
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue q = new java.util.LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+ " ");
        }
        System.out.println();
    }
}
