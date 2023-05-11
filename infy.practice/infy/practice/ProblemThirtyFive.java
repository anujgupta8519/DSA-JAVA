import java.util.*;
public class ProblemThirtyFive {
    public static List<String> getSumarray(int arr[]) {
        List<String> restult = new ArrayList<String>();
        if (arr.length<=0) {
            return restult;
        } else {
            for (int i = 0; i < arr.length; i++) {
                int st = arr[i];
                while (i+1<arr.length&&arr[i+1]==arr[i]+1) {
                    i++;
                }
                if (st!=arr[i]) {
                    restult.add(""+st+"->"+arr[i]);
                    
                }else{
                    restult.add(""+st);
                }
                
            }
            
        }
        return restult;
        
    }
    public static void main(String[] args) {
        // test case first
        int arr[] = {0,1,2,4,5,7};
        System.out.println(getSumarray(arr));
        //test case second
        int arr1[] = {0,2,3,4,6,8,9};
        System.out.println(getSumarray(arr1));
        
    }
    
}
