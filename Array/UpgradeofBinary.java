public class UpgradeofBinary {
    public static int upgradeBinarySearch(int arr[], int key) {
        int start =0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if (key==arr[mid]) {
                return mid;
                
            }
                if (arr[start]<arr[mid]) {
                    if (arr[start]<=key&& key<=arr[mid-1]) {
                        end= mid-1;
                        
                    } else {
                        start = mid+1;
                        
                    }
                    
                } else {
                    if (key>=arr[mid+1] && key<= arr[end]) {
                        start = mid+1;
                        
                    } else {
                        end = mid -1;
                        
                    }
                    
                
                
            }

            }

        return -1;

        
    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2,44,66};
        int key = 660;
        System.out.println("Your key is on index :" +upgradeBinarySearch(arr, key));
    }
    
}
