public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println(s.peek());
    }
    
}
class Stack1{
    private Node head;
    private int size;
    public boolean isEmpty() {
        return head==null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            size++;
            return;
        }else  {
            newNode.next=head;
            head=newNode;
            size++;
            return;
            
        }
    }
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        if (size==1) {
            int da = head.data;
            head=null;
            return da;
        }else{
            int da = head.data;
            head=head.next;
            return da;
        }
    }
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}