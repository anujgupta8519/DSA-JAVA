public class QuickSort {
    public static void quicksort(int arr[], int si, int ei) {
        if(si>=ei){
          return;
        }
        int patrion = part(arr, si, ei);
        quicksort(arr, si, patrion-1);
        quicksort(arr, patrion+1, ei);
    }
    public static int part(int arr[], int si, int ei) {
        int patrion = arr[ei];
        int i = si-1;
        for (int j = si; j < arr.length; j++) {
            if (arr[j]<=patrion) {
                i++;
                int temp =arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = patrion;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
        
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-6};
        quicksort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
