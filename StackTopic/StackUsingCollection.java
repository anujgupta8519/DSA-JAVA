import java.util.*;;
public class StackUsingCollection {
    public static void main(String[] args) {
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(1);
            stack.push(2);
            while (!stack.isEmpty()) {
                System.err.println(stack.pop());
            }

            
    }
    
}
