public class BinarySearch {
    //Time Complexity = log(n)
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        int count = 0;
        while (start<=end) {
            count++;
            int mid = (start+end)/2;
            if (arr[mid]==key) {
                System.out.println(count);
                return mid;
                
            } else if (arr[mid]<key) {
                start= mid+1;
            } else if (arr[mid]>key) {
                end = mid-1;
                
            }

                
            
            
        }
        
        return -1;

        
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int key =150;
        int result = binarySearch(arr, key);
        if (result==-1) {
            System.out.println("Key isn't in this array");
        }else{
            System.out.println("key is on index :" + result);

        }
        
    }
    
}
