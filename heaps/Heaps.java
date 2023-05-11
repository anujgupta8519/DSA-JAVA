package heaps;

import java.util.ArrayList;

public class Heaps {

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
class Heap{
    ArrayList<Integer> al = new ArrayList<>();
    public void add(int data) {
    al.add(data);
    int x = al.size()-1;
    int parent = (x-1)/2;
    while (al.get(x)<al.get(parent)) {
        int temp = al.get(x);
        al.set(x, al.get(parent));
        al.set(parent, temp);
        x=parent;
        parent= (x-1)/2;
        
    }       
    }
    public int peek() {
       return al.get(0); 
    }
    private void heapify(int i) {
        int left = 2*i+1;
        int right = 2*i+2;
        int minInx = i;
        if (left<al.size()&&al.get(minInx)>al.get(left)) {
            minInx=left;
        }
        if (right<al.size()&&al.get(minInx)>al.get(right)) {
            minInx=right;
        }
        if (minInx!=i) {
            int temp = al.get(i);
            al.set(i, al.get(minInx));
            al.set(minInx, temp);
            heapify(minInx);
        }
        
    }
    public int remove() {
        //Swap 1st and last
        int temp = al.get(0);
        al.set(0, al.get(al.size()-1));
        al.set(al.size()-1, temp);
        //remove last 
        int returnable = al.remove(al.size()-1);
        //heapify
        heapify(0);
        return returnable;
    }
    public boolean isEmpty() {
        return al.size()==0;
    }

}
