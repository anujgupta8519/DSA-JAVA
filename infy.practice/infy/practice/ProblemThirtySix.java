import java.util.HashSet;
import java.util.Set;

public class ProblemThirtySix {
    public static boolean isDublicateValue(int arr[]) {
        Set<Integer> temp = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!temp.add(arr[i])) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        //first test case
        int arr[] = {1,2,3,1};
        System.out.println(isDublicateValue(arr));
        //second test case
        int arr1[] = {1,2,3,4};
        System.out.println(isDublicateValue(arr1));
        //third test case
        int arr2[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(isDublicateValue(arr2));
    }
    
}
