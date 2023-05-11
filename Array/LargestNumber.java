public class LargestNumber {
     public static int findLargestNumber(int arr[]) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
                
            }

            
        }
        return max;
        
    }
    public static void main(String[] args) {
        int arr[] = {10,15,20,25,30,3377,35,40,45,50,55,60};
        int result= findLargestNumber(arr);
        System.out.println("Largest number is : "+ result);

        
    }
    
}
