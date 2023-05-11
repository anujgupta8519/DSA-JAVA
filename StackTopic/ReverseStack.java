import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int item = s.pop();
        reverseStack(s);
      
        insertinBottem(s, item);
    }
    public static void insertinBottem(Stack<Integer> s, int item) {
        if (s.isEmpty()) {
            s.push(item);
            return;
        }
        int t = s.pop();
        insertinBottem(s, item);
        s.push(t);
    
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
        
    }
}
