package Sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int pre = i-1;
            while (pre>=0 &&arr[pre]>temp) {// change Greater then to less then then it will return desending order
                arr[pre+1] = arr[pre];
                pre--;
                
            }
            arr[pre+1] = temp;

                
            }


            
        }
        
    
    public static void main(String[] args) {
        int arr[] = {5,4,9,2,1};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i+",");
        }
    }
}
