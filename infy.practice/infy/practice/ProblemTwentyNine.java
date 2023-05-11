import java.util.Arrays;

public class ProblemTwentyNine {
    public static int maxDiffrence(int arr[]) {
        int max =0;
        if (arr.length <2) {
            return max;
        }else{
            Arrays.sort(arr);
            for (int i = 1; i < arr.length; i++) {
                int temp = arr[i] - arr[i-1];
                max = Math.max(max, temp);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // First test case
        int arr[] = {3,6,9,1};
        System.out.println(maxDiffrence(arr));
        //Second Test case
        int arr1[] = {10};
        System.out.println(maxDiffrence(arr1));

    }
}
