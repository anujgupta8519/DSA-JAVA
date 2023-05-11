public class MaxofSubarray {
    public static int maxOfSubArray(int arr[]) {
        int sumofSubarray = 0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
              sumofSubarray=0;
                
                for (int j2 = i; j2 <= j; j2++) {
                    sumofSubarray=sumofSubarray+ arr[j2];  
                }
                System.out.println(sumofSubarray);
                if (sumofSubarray>max) {
                    max=sumofSubarray;
                    
                }
                
                
            }
            
            
        }
        return max;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println("max of subarrays : "+maxOfSubArray(arr));
    }
    
}
