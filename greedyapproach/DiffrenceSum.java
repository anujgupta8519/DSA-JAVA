import java.util.Arrays;

public class DiffrenceSum {
    public static int diffrenceSum(int arr1[], int arr2[]) {
        int sum =0;
        Arrays.sort(arr1);Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            int temp = Math.abs(arr1[i] - arr2[i]);
            sum+=temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr1[] ={4,1,8,7};
        int arr2[] ={2,3,6,5};
        System.out.println(diffrenceSum(arr1, arr2));
    }
    
}
