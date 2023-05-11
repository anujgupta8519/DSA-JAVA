package queue;

public class QueueArray {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
        queue.remove();

       
    }
    
}
class Queue{
   private int arr[];
   private int rear;
    int size;
   Queue(int n){
       arr=new int[n];
       size=n;
       rear =-1;
   }
   public boolean isEmpty() {
     return rear==-1;
    
   }
   public void add(int data) {
    if (rear==size-1) {
        System.out.println("Queue is full");
        return;
    }
    rear=rear+1;
    arr[rear]=data;


   }
   public int remove() {
    if (isEmpty()) {
        System.out.println("Empty queue");
        return -1;
    }
    int front = arr[0];
    for (int i = 0; i < rear; i++) {
        arr[i]=arr[i+1];
    }
    rear=rear-1;
    return front;
    
   }
   public int peek() {
    if (isEmpty()) {
        System.out.println("Empty queue");
        return -1;
    }
    return arr[0];
   }
}
