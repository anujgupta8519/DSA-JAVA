import java.util.Stack;
public class ProblemThirty {

    static class MinStack {

        Stack<Integer> stack, Min;
        MinStack() {
            stack = new Stack<Integer>();
            Min = new Stack<Integer>();
        }

        void push(int num) {
            stack.push(num);
            if (Min.empty() || Min.peek() >= num) {
                Min.push(num);
            }
        }

        // Function to remove the top element of the stack.
        int pop() {
            if (!Min.empty() && Min.peek() == stack.peek()) {
                Min.pop();
            }

            int ret = -1;

            if (!stack.empty()) {
                ret = stack.peek();
                stack.pop();
            }

            return ret;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            int ret = -1;
            if (!stack.empty()) {
                ret = stack.peek();
            }
            return ret;
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            int ret = -1;
            if (!Min.empty()) {
                ret = Min.peek();
            }
            return ret;
        }
    }
    public static void main(String[] args) {
        MinStack minstack = new MinStack();
        minstack.push(-2);
        minstack.push(0);
        minstack.push(-3);
       System.out.println( minstack.getMin());
        minstack.pop();
      System.out.println(minstack.top());
        System.out.println( minstack.getMin());


    }
}

