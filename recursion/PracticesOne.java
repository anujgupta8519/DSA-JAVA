package recursion;

public class PracticesOne {
    public static void printkeyindex(int arr[], int key, int i) {
        if (i==arr.length) {
            return;
        }
        if (arr[i]==key) {
            System.out.print(i+" ");
        }
        printkeyindex(arr, key, i+1);
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,9,2,3,2};
        printkeyindex(arr,2, 0);
    }
}
