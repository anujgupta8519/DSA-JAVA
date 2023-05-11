import java.util.ArrayList;
import java.util.List;

public class ProblemTwentyThreeSecond {
    public static int getMinofArray(int arr[], int ei) {
        if (ei==0) {
            return arr[0];
        }
        return Math.min(arr[ei], getMinofArray(arr, ei-1));
        
    }
    //Function
    public static int minPath(List<int[]> ls) {
        int sum=0;
        for (int i = 0; i < ls.size(); i++) {
           sum = sum + getMinofArray(ls.get(i),ls.get(i).length-1);
         
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {2};
        int arr1[] = {3,4};  
        int arr2[] ={6,5,7};
        int arr3[] ={4,1,8,3};
        List<int[]> ls = new ArrayList<>();
        ls.add(arr);
        ls.add(arr1);
        ls.add(arr2);
        ls.add(arr3);
       
        System.out.println(minPath(ls));
        List<int[]> ls1 = new ArrayList<>();
        int arr4[] = {-10};
        ls1.add(arr4);
        System.out.println(minPath(ls1));
    }
}
