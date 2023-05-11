package LinkedListTopic;

public class DoublyLinkedList {
    static Node head;
    static Node tail;
    static int size;
    public void addFirst(int data) {
        Node neNode = new Node(data);
        if (head==null) {
             head=tail=neNode;
             size++;
             return;
        
        }else{
            neNode.next=head;
            head.pre=neNode;
            head=neNode;
            size++;
            return;

        }
        
    }
    public int removeFirst() {
        if (head==null) {
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        }else if (size==1) {
            int data = head.data;
            head=tail=null;
            size--;
            return data;
        }else{
            int data = head.data;
            head=head.next;
            head.pre=null;
            size--;
            return data;
        }
        
    }
    public void addLast(int data) {
        Node neNode = new Node(data);
        if (head==null) {
             head=tail=neNode;
             size++;
             return;
        
        }else{
            neNode.pre=tail;
            tail.next=neNode;
            tail=neNode;
            size++;
            return;

        }  
        
    }
    public int removeLast() {
        if (head==null) {
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        }else if (size==1) {
            int data = head.data;
            head=tail=null;
            size--;
            return data;
        }else{
            int data = tail.data;
            Node temp = tail;
            tail=tail.pre;
            tail.next=null;
            temp.pre=null;
            size--;
            return data; 


    }

    
}
public void printData() {
    Node temp = head;
    while (temp!=null) {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("Null");
    System.out.println();
}
public void reverse() {

    Node curr= head;
    Node pre = null;
    Node next;
    while (curr!=null) {
    next= curr.next;
    curr.next=pre;
    curr.pre=next;
    pre=curr;
    curr=next;
    }
    head=pre;
}
public static void main(String[] args) {
    DoublyLinkedList dl = new DoublyLinkedList();
    dl.addFirst(2);
    dl.addLast(3);
    dl.addLast(6);
    dl.printData();
    // dl.removeLast();
    // dl.removeFirst();
    dl.reverse();
    dl.printData();

        
}

class Node{
    int data;
    Node next;
    Node pre;
    Node(int data ){
     this.data=data;
     this.pre=null;
     this.next=null;
    }
}}

