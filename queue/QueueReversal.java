package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer>s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
         q.add(s.pop());   
        }
        
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
        Iterator<Integer> i = q.iterator();
        while (i.hasNext()) {
       System.out.print(i.next()+" ");            
        }
        System.out.println();
        reverse(q);
        Iterator<Integer> i1 = q.iterator();
        while (i1.hasNext()) {
            System.out.print(i1.next()+" ");
        }
    }
}
