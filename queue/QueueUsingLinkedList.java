package queue;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
       // System.out.println(queue.peek());
        while (!queue.isEmpty()) {
               System.out.println(queue.peek());
               queue.remove();
        }
        queue.remove();
        queue.peek();

    }
    
}
class Queue{
  private  Node head;
   private Node tail;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head==null) {
            head = tail=newNode;
            return;
        }else
        { 
        tail.next=newNode;
        tail=newNode; }
    }
    public boolean isEmpty() {
        return head==null && tail==null;
        
    }
    public int remove() {
        if (isEmpty()) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
       else if (head==tail) {
            int result = head.data;
            head=tail=null;
            return result;
        }else{
            int result = head.data;
            head=head.next;
            return result;
        }
        
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("empty");
            return -1;
            
        }else{
            return head.data;


        }
    }


}
class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      next=null;

    }
}
