package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class InterLeaves{
    public static void interLeaves(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> temp = new LinkedList<>();
        for (int i = 0; i < (size/2); i++) {
            temp.add(q.remove());
            
        }
        while (!temp.isEmpty()) {
            q.add(temp.remove());
            q.add(q.remove()); 
        }
        
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);q.add(6);q.add(7);q.add(8);q.add(9);q.add(10);
        Iterator<Integer> i = q.iterator();
        while (i.hasNext()) {
       System.out.print(i.next()+" ");            
        }
        System.out.println();
        interLeaves(q);
        Iterator<Integer> i1 = q.iterator();
        while (i1.hasNext()) {
            System.out.print(i1.next()+" ");
        }
        

        
    }

}