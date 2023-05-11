package graph;

import java.util.PriorityQueue;

import heaps.PriorityQue;

public class MinimumCost {
    public static int connectcities (int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
       boolean vis
    }
public static void main(String[] args) {
    int cities[][] = {
                    {0,1,2,3,4},
                    {1,0,5,0,7},
                    {2,5,0,6,0},
                    {3,0,6,0,0},
                    {4,7,0,0,0}
    };
}
    
}
class Edge implements Comparable<Edge>{
    int dest;
    int cost;
    public Edge(int dest, int cost) {
        this.dest = dest;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge o) {
      return this.cost-o.cost;
    }
}
