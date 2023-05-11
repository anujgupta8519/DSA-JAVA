package heaps;

import java.util.PriorityQueue;

public class ConnectRope {
    public static int minimunCost(int arr[]) {
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }
       
        while (pq.size()>1) {
           int one = pq.remove();
           int two = pq.remove();
           int sum = one+two;
            cost+=sum;
            pq.add(sum);
        
        }
        return cost;
         
    }
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,6};
        System.out.println(minimunCost(arr));
    }
    
}
