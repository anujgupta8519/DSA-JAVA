package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos]>arr[j]) {// change Greater then to less then then it will return desending order
                    minPos=j;
                    
                }
            }
            //Swap the value
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
            
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,0,1,2,3};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+",");
            
        }
    }
    
}
