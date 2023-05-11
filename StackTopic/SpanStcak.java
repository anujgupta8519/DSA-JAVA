import java.util.Stack;

public class SpanStcak {
    public static int[] apanArray(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int ar[] = new int[arr.length];
        ar[0]=1;
        s.push(0);
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            while (!s.isEmpty()&&curr>arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ar[i] =i+1;
            }else{
                ar[i] = i-s.peek();
            }
           s.push(i);
            
        }
        return ar;
        
    }
    public static void main(String[] args) {
        
        int stocks[]= {100,80,60,70,60,85,100};
        int arr[] = apanArray(stocks);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
    
}
