package queue;

public class CircularQueueArray {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        circularQueue.add(1);
        circularQueue.add(2);
        while (!circularQueue.isEmpty()) {
            System.out.println(circularQueue.peek());
            circularQueue.remove();
        }
        
    }
    
}
class CircularQueue{
    private int arr[];
      int size;
    private int front;
    private int rear;
    CircularQueue(int n){
        arr=new int[n];
        size=n;
        rear =-1;
        front=-1;
    }
    public boolean isEmpty() {
        return rear==-1&&front==-1;
       
      }
      public boolean isFull() {
        return (rear+1)%size==front;
        
      }
      public void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front==-1) {
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    
    
       }
       public int remove() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        int result = arr[0];
        if (rear==front) {
            rear=front=-1;
        } else {
            front = (front+1)%size;
        }
     
        return result;
        
       }
       public int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return arr[front];
       }


}
