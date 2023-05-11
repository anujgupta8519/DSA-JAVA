package Sorting;

public class CountingSort {
    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
            
        }
        int countArray[] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
            
            
        } int j =0;//set value j=arr.length-1 for desending order
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i]>0) {
                arr[j]= i;
                j++;//j-- for desending order
                countArray[i]--;
                
            }
            
        }
        
    }
    public static void main(String[] args) {
        int arr[] ={7,9,10,99,98,97,3,1,1,1,1,2,2,2};
        countingSort(arr);
        for (int i : arr) {
            System.out.print(i+",");
        }
    }
}
