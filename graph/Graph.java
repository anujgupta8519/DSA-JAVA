package graph;

import java.util.ArrayList;
import java.util.Stack;

public class Graph {
    public static void creategraph(ArrayList<Edge> graph[] ) {
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 0, 1));
    }
    public static boolean isCycle(ArrayList<Edge> graph[] ) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtill(graph,i,vis,stack)) {
                    return true;
                }
                
            }
        }
        return false;
    } public static boolean isCycleUtill(ArrayList<Edge> graph[], int curr,   boolean vis[], boolean stack[]    ) {
     vis[curr]= true;
     stack[curr]= true;
     for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        if (stack[e.des]) {
            return true;
        }
        if (!vis[e.des]&&isCycleUtill(graph, e.des, vis, stack)) {
            return true;
        }
     }
     stack[curr]=false;
     return false;


    }
    public static void topSort(ArrayList<Edge>graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtiill(graph,i,vis,s);
            }
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop()+"");
        }
    }
    public static void  topSortUtiill(ArrayList<Edge>graph[],int curr, boolean vis[], Stack<Integer> s) {
        vis[curr]= true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.des]) {
                topSortUtiill(graph, e.des, vis, s);
            }
            s.push(curr);
        }
    }
    public static void allPath(ArrayList<Edge>graph[], int src, int des, String s) {
        if (src==des) {
            System.out.println( s+des);
            return;
        }else{
            for (int i = 0; i < graph[src].size(); i++) {
                Edge e = graph[src].get(i);
                allPath(graph,e.des , des, s+src);
            }
        }
    }
    
   public static void main(String[] args) {
    int v=4;
    ArrayList<Edge>graph[] = new ArrayList[v];
    creategraph(graph);
    System.out.println(isCycle(graph));
    topSort(graph);


    
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