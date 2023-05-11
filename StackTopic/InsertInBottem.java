import java.util.Stack;

public class InsertInBottem {
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
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        insertinBottem(stack, 4);
        System.out.println(stack);

    }
}
