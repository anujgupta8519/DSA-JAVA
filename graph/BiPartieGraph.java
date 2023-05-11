package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BiPartieGraph {
    public static void creategraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();      
        }
        //0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        //1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        //2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        //3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1)); 
        //4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        
    }
    public static boolean biPartieGraph(ArrayList<Edge>[] graph) {
      int[] col = new int[graph.length];
      for (int i = 0; i < col.length; i++) {
        col[i] = -1;
      }  
      Queue<Integer> qu = new LinkedList<>();
      for (int i = 0; i < graph.length; i++) {
        if (col[i]==-1) {
            qu.add(i);
            col[i] = 0;
            while (!qu.isEmpty()) {
                int curr = qu.remove();
                for (int j = 0; j < graph[curr].size(); j++) {
                   Edge e = graph[curr].get(j); 
                   if (col[e.des]==-1) {
                    int next = col[curr]==0?1:0;
                    col[e.des] =  next;
                    qu.add(e.des);
                   }else if (col[e.des]==col[curr]) {
                    return false;
                   }
                }
            }
            
        }
      }
      return true;
    }
    public static void main(String[] args) {
        int v =5;
       ArrayList<Edge>[] graph = new ArrayList[5]; 
       creategraph(graph);
       System.out.println(biPartieGraph(graph));
    }
}
class Edge{
    int src;
    int des;
    int wgt;
    public Edge(int src, int des, int wgt) {
        this.src = src;
        this.des = des;
        this.wgt = wgt;
    };
    
}
