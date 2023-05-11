import java.util.ArrayList;

public class StackUsingArrayList {

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
           // s.pop();
        }
        System.out.println(s.pop());

        
        
    }
    
}
class Stack1{
    private ArrayList<Integer> al = new ArrayList<>();
    public boolean isEmpty() {
        return al.size()==0;
    }
    public void push(int data) {
        al.add(data);
    }
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = al.get(al.size()-1);
        al.remove(al.size()-1);
        return top;
    }
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return al.get(al.size()-1);
    }
}