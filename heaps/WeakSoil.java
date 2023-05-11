package heaps;

import java.util.PriorityQueue;

public class WeakSoil {
    public static void main(String[] args) {
        int arr[][] ={{1,0,0,0},
                     {1,1,1,1},
                    {1,0,0,0},
                    {1,0,0,0}};
                    
    PriorityQueue<Row> pq = new PriorityQueue<>();
     for (int i = 0; i < arr.length; i++) {
        pq.add(new Row(i, arr[i]));
     }
     int k =2;
    for (int i = 0; i < k; i++) {
        Row s = pq.remove();
        System.out.println("R"+s.inx);
    }   
    }
}
class Row implements Comparable<Row>{
    int inx;
    int count ;
    Row(int inx, int arr[]){
        this.inx = inx;
        for (int i : arr) {
            count+=i;
        }
    }
    @Override
    public int compareTo(Row o) {
        if (this.count!=o.count) {
           return this.count-o.count; 
        }else{
            return this.inx-o.inx;
        }
        
    }
}
