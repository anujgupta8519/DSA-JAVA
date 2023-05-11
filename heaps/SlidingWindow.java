package heaps;


import java.util.PriorityQueue;

public class SlidingWindow {
    static class Pair implements Comparable<Pair>{
        int inx;
        int val;
        public Pair(int inx, int val) {
            this.inx = inx;
            this.val = val;
        }
        @Override
        public int compareTo(Pair o) {
            // TODO Auto-generated method stub
            return o.val-this.val;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k =3;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(i, arr[i]));  
        }
        int result[] = new int[arr.length-k+1];
        result[0]= pq.peek().val;
        for (int i = k; i < arr.length; i++) {
            while (pq.size()>0&&pq.peek().inx<=(i-k)) {
                pq.remove();
            }
            pq.add(new Pair(i, arr[i]));
            result[i-k+1]=pq.peek().val;
        }
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
