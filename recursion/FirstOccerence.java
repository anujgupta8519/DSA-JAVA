package recursion;

public class FirstOccerence {
    public static int firstoccerence(int arr[], int i, int key) {
        if (i==arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        } else {
           return firstoccerence(arr, i+1, key);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {19,5,6,8,3};
        int key = 3;
        int i = 0;
        System.out.println(firstoccerence(arr, i, key));
        
    }
    
}
