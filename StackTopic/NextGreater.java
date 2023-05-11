import java.util.Stack;

public class NextGreater {
    public static int[] nextGrater(int num[]) {
        int arr[] = new int[num.length];
        Stack<Integer> s = new Stack<>();
        for (int i = num.length-1; i >=0; i--) {
            while (!s.isEmpty()&&num[s.peek()]<=num[i]) {
        
                    s.pop();
            
            }
            if (s.isEmpty()) {
                arr[i] = -1;

            }else{
                arr[i] = num[s.peek()];
            }
            s.push(i);
            

            
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int num[]={6,8,0,1,3};
int arr[]=nextGrater(num);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
