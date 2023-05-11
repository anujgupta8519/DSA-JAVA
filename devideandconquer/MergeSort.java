public class MergeSort {
    public static void mergesort(int arr[], int st, int end) {
        if (st>=end) {
            return;
        }
        int mid = st + (end-st)/2;
        mergesort(arr, st, mid);
        mergesort(arr, mid+1, end);
        merge(arr, st, mid, end);
    }
    public static void merge(int arr[], int st, int mid, int end) {
        int temp[] = new int[end-st+1];
        int i = st;
        int j = mid+1;
        int k =0;
        while (i<=mid&& j<=end) {
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;k++;
                
            } else {
                temp[k] = arr[j];
                j++;k++;
                
            }
            
        }
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while (j<=end) {
            temp[k++] = arr[j++];
        }
        for ( k = 0, i =st; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
