public class KadaneSum {
    public static int kadanes_sum(int arr[]) {
        int current_sum=0;
        int max_sum = Integer.MIN_VALUE;
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {

            current_sum = current_sum+arr[i];
            if (current_sum<0) {
                current_sum=0;
                
            }
            if (current_sum>max_sum) {
                max_sum=current_sum;
            }
            if (max_sum==0) {
                temp = Math.max(temp, arr[i]);   
                max_sum =temp;
            }
            
            }
           return max_sum;  
        }

        
        
    
    //negative
    public static int max_negative_number(int arr[]) {
        int max =arr[0];
        int current = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<current+arr[i]) {
                current = current+arr[i];
                
            }else{
                current=arr[i];
            }if (max<current) {
                max=current;
                
            }
            
        }

        return max;
        
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3,0};
        System.out.println("Max of Sub-Arrays is : "+max_negative_number(arr));
        System.out.println("Max of Sub-Arrays is : "+kadanes_sum(arr));
    }
    
}
