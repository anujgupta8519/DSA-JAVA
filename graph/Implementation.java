package graph;

import java.util.*;

public class Implementation {
    public static void creategraph( ArrayList<Edge>[] graph ) {
               
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
        graph[3].add(new Edge(3, 5, 1));
        //4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        //5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        //6
        graph[6].add(new Edge(6, 5, 1));
        
    }
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean isVisted[] =new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (isVisted[i]==false) {
                bfsUtil(graph, isVisted);
            }
        }
        
    }
    public static void bfsUtil(ArrayList<Edge>[] graph,boolean isVisted[] ) {
        Queue<Integer> q = new LinkedList<>() ;
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (isVisted[curr]==false) {
                System.out.print(curr+" ");
                isVisted[curr]=true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge edge = graph[curr].get(i);
                    q.add(edge.des);
                    
                }
            }
        }

        
    }
    public static void dfs(ArrayList<Edge>[] graph) {
        boolean isVisted[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
          if (isVisted[i]==false) {
            dfsUtil(graph, i, isVisted);
          }
            
        }
        
    }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean isVisted[]) {
        System.out.print(curr+" ");
        isVisted[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!isVisted[e.des]) {
                dfsUtil(graph, e.des, isVisted);
            }
        }
        
    }
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int des, boolean isVisted[]) {
        if (src==des) {
            return true;
        }
        isVisted[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (isVisted[e.des]==false&&hasPath(graph, e.des, des, isVisted)) {
                return true;
            }
        }
        return false;
        
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean isVisted[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
          if (isVisted[i]==false) {
            return detectCycleUtil(graph, isVisted, i, -1);
          }
            
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean isVisted[],int curr, int  par ) {
       isVisted[curr]=true;
       for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        if (!isVisted[e.des]) {
            if (detectCycleUtil(graph, isVisted, e.des, curr)) {
                return true;
            }
        }
        else if (isVisted[e.des]&&e.des!=par) {
            return  true;
        }
       }
       return false;
        
    }
    public static void main(String[] args) {
        int v =7;
        //@SuppressWarnings(value = { "no" })
        ArrayList<Edge>[] graph = new ArrayList[v];
        // for (int i = 0; i < graph.length; i++) {
        //     graph[i] = new ArrayList<>();
            
        // }
        // //0
        // graph[0].add(new Edge(0, 1, 5));
        // //1
        // graph[1].add(new Edge(1, 0, 5));
        // graph[1].add(new Edge(1, 2, 1));
        // graph[1].add(new Edge(1, 3, 3));
        // //2
        // graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 3, 1));
        // graph[2].add(new Edge(2, 4, 2));
        // //3
        // graph[3].add(new Edge(3, 1, 3));
        // graph[3].add(new Edge(3, 2, 1));
        // //4
        // graph[4].add(new Edge(4, 2, 2));
        // for (int i = 0; i < graph[2].size(); i++) {
        //     System.out.println(graph[2].get(i).des);
            
        // }
        creategraph(graph);
        dfs(graph);
        System.out.println(hasPath(graph, 0, 5, new boolean[v]));

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
