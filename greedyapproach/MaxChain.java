import java.util.Arrays;
import java.util.Comparator;

public class MaxChain {
    public static int maxChain(int arr[][]) {
        Arrays.sort(arr, Comparator.comparingDouble(o->o[1]));
        int max =1;
        int lastInx = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0]>lastInx) {
                max++;
                lastInx=arr[i][1];
            }
            
        }
        return max;
          
    }

    
    public static void main(String[] args) {
        int arr[][]={{5,24},
                     {39,60},
                     {5,28},
                     {27,40},
                     {50,90}
        };
        System.out.println(maxChain(arr));
        
    }
    
}
