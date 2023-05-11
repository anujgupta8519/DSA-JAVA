package heaps;

public class HeapSort {
    public static void heapify(int arr[], int i, int n) {
        int left = 2*i+1;
        int right=2*i+2;
        int maxInx = i;
        if (left<n&&arr[left]<arr[maxInx]) {
            maxInx=left;
        }
        if (right<n&&arr[right]<arr[maxInx]) {
            maxInx=right;
        }
        if (maxInx!=i) {
            int temp = arr[i];
            arr[i] = arr[maxInx];
            arr[maxInx] = temp;
            heapify(arr, maxInx, n);
        }
        
    }
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = n/2; i >=0; i--) {
            heapify(arr, i, n);
        }
        for (int i = n-1; i >0; i--) {
           int temp = arr[0];
           arr[0]=arr[i];
           arr[i] = temp;
           heapify(arr, 0, i); 
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {5,6,8,1,3,9};
        sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
