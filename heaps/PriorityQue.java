package heaps;

import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("abc", 8));
        pq.add(new Student("krishna", 1));
        pq.add(new Student("Yashika", 2));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+" "+pq.peek().rank);
            pq.remove();
        }
        
    }
}
class Student implements Comparable<Student>{
    String name;
    int rank;
    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    @Override
    public int compareTo(Student o2) {
        return this.rank-o2.rank;
    }

    
}
