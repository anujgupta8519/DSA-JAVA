package recursion;

public class CheackSortedOrNot {
    public static boolean sortedornot(int arr[], int i) {
        if (arr.length-1 == i) {
            return true;
        }
        if (arr[i]<=arr[i+1]) {
             return sortedornot(arr, i+1);
        }else{
            return false; 

        }
          
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,1,9,45};
       System.out.println( sortedornot(arr, 0));
        
    }
}
