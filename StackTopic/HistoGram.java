import java.util.Stack;

public class HistoGram {
    public static int getMaxofArea(int arr[]) {
        int max =0;
        int nsr [] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next small right
        Stack<Integer> s1 = new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            while (!s1.isEmpty() &&arr[s1.peek()]  >=arr[i]) {
                s1.pop();
            }
            if (s1.isEmpty()) {
                nsr[i] = arr.length;
            }else{
                nsr[i] = s1.peek();
            }
            s1.push(i);
            
        }
        //nextsmall left
        Stack<Integer> s2 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s2.isEmpty() &&arr[s2.peek()]  >=arr[i]) {
                s2.pop();
            }
            if (s2.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s2.peek();
            }
            s2.push(i);
            
        }
        for (int i = 0; i < arr.length; i++) {
            int h = arr[i];
            int w = nsr[i]-nsl[i]-1;
            int area = h*w;
            max = Math.max(max, area);
            
        }
        return max;
            
        }
    
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println(getMaxofArea(arr));
        
    }
}
