package LinkedListTopic;

import java.security.Key;

public class LinkedList{
    static class Node {
        int data;
        Node next;
        Node(int data ){
            this.data=data;
            this.next=null;
        }

    
        
    }
    static Node head;
    static Node tail;
    static int size;
    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }else{
      //point to head
        newNode.next=head;
        //head to newNode
        head=newNode;

        }

    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head==null) {
           head=tail=newNode;
           return; 
        }else{
          tail.next=newNode;
            tail=newNode;
        }

    }
    public void printData() {
        Node tempNode = head;
        if (tempNode==null) {
            System.out.println("Linked List is empty");
        }else{
            while (tempNode!=null) {
                System.out.print(tempNode.data+" ->");
                tempNode=tempNode.next;
            }
            System.out.println("Null");

        }

    }
    public void add(int index, int data){
        if (index==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while (i<index-1) {
            temp = temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next= newNode;
    }
    public int removeFirst(){
        if (size==0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {

            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int result = head.data;
        size--;
        head = head.next;
        return result;
    }
    public int removeLast() {
        if (size==0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {

            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
        
    }
    public int FindPosition(int key) {
        int result =0;
        Node temp = head;
        while (temp!=null) {
            if (temp.data==key) {
                return result;
            }else{
                temp=temp.next;
                result++;
            }
        }
        return -1;
    }
    public int helper(Node head, int key) {
        if (head==null) {
            return -1;
        }
        if (head.data==key) {
            return 0;
        }
        int inx = helper(head.next, key);
        if (inx==-1) {
            return -1;
        }
        return inx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }
    public void reverse(){
        Node pre = null;
        Node current = tail=head;
        Node nex;
        while (current!=null) {
            nex =current.next;
            current.next=pre;
            pre = current;
            current=nex; 
        }
        head=pre;
    }
    public void deleteNthFromEnd(int n){
      int pos = size-n+1;
      Node pre = null;
      Node curr = head;
      int i =1;
      if (n==size) {
        head=head.next;
        return;
      }
      while (i!=pos) {
        pre=curr;
        curr=curr.next;
        i++;
      }
      pre.next=curr.next;

  
    }
    public Node findMid(Node head) {
        Node slow =head;
        Node fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }
    public boolean checkPalidrom() {
        if (head==null||head.next==null) {
            return true;
        }
        Node mid=findMid(head);
        //reverse
        Node pre = null;
        Node current = mid;
        Node nex;
        while (current!=null) {
            nex =current.next;
            current.next=pre;
            pre = current;
            current=nex; 
        }
        Node right=pre;
        Node left=head;
        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

        
    }
    public boolean floyedCyclie() {
        Node slow = head;
        Node fast = head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                return true;
            }
        }
        return false;
    }
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean isTrue = false;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                isTrue =true;
                break;
            }
        }
        if (isTrue==false) {
            return;
        }
        Node pre = null;
        slow=head;
        while (slow!=fast) {
            pre = fast;
            slow=slow.next;
            fast=fast.next;  
        }
        pre.next=null;
        
    }
    //merge linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast!=null &&fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow; }
        private Node merge(Node head1, Node head2) {
            Node mergell=new Node(-1);
            Node temp = mergell;
            while (head1!=null&&head2!=null) {
                if (head1.data<=head2.data) {
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                }else{
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                }}
                while (head1!=null) {
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                }
                while (head2!=null) {
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                }
            return mergell.next;
        }
        public Node mergeSort(Node head) {
            if (head==null||head.next==null) {
                return head;
            }
            Node mid = getMid(head);
            Node righthead= mid.next;
            mid.next=null;
            Node newleft = mergeSort(head);
            Node newright =mergeSort(righthead);
            return merge(newleft, newright);
            
        }
        //ZigZag Code 
        public void ZigZag() {
            //find mid
            Node slow = head;
            Node fast = head.next;
            while (fast!=null&&fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid = slow;
            //reverse
            Node current = mid.next;
            mid.next=null;
            Node pre = null;
            Node next;
            while (current!=null) {
                next=current.next;
                current.next=pre;
                pre=current;
                current=next;
            }
            //zigZag
            Node left = head;
            Node right = pre;
            Node leftN, rightN;
            while (left!=null&right!=null) {
                leftN=left.next;
                left.next=right;
                rightN = right.next;
                right.next=leftN;
                left=leftN;
                right=rightN;
            }
        }
   
public static void main(String[] args) {
 LinkedList ll = new LinkedList();
 //ll.printData();
//  ll.addFirst(2);
// ll.addFirst(1);
// ll.addLast(4);
// ll.addLast(5);
// ll.add(2, 3);
// ll.printData();
// System.out.println(ll.size);
// ll.removeFirst();
// ll.printData();
// ll.removeLast();
// ll.printData();
// System.out.println(ll.size);
// System.out.println(ll.FindPosition(4));
// System.out.println(ll.recSearch(4));
// ll.reverse();
// ll.printData();
// ll.deleteNthFromEnd(5);
// ll.printData();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(2);
    ll.addLast(1);
    ll.addLast(7);
//    head.next.next.next.next.next =head.next;
//    System.out.println(ll.floyedCyclie());
//    ll.removeCycle();
//    ll.printData();
//   System.out.println(ll.floyedCyclie());
    
    ll.printData();
    // System.out.println(ll.checkPalidrom());
    // ll.printData();
  ll.ZigZag();
    ll.printData();
}
}