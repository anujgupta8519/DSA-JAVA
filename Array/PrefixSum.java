public class PrefixSum {
    public static void name(int arr[]) {
        int currSum =0;
        int max = Integer.MIN_VALUE;
        int pre[] = new int[arr.length];
        pre[0]=arr[0];
        //calculate 
        for (int i = 1; i < pre.length; i++) {
         pre[i]=pre[i-1]+arr[i];   
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                currSum = i==0?pre[j]:pre[j]-pre[i-1];
                if (max<currSum) {
                    max=currSum;
                }
                
            }
            
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        //System.out.println("max of subarrays : "+maxOfSubArray(arr));
        name(arr);
    }
}