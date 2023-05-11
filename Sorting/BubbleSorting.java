package Sorting;

public class BubbleSorting {
    private static void bubble_sorting(int arr[]) {
        for (int turn = 0; turn < arr.length-1; turn++) {
            int swap = 0;
            for (int i = 0; i < arr.length-1-turn; i++) {
                if (arr[i]>arr[i+1]) { // change Greater then to less then then it will return desending order
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    swap++;   
                }  
            }
            if (swap==0) {
                break;
                
            }
            
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,12,0,2,6,8};
        bubble_sorting(arr);
        for (int i : arr) {
            System.out.print(i+",");
            
        }
    }
    
}
