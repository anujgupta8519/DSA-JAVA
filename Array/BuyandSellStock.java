public class BuyandSellStock {
    public static int buyandSellStock(int arr[]) {
        // int min =Integer.MAX_VALUE;
        // int day =0;
        // int max =Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     if(min>arr[i]){
        //         min=arr[i];
        //         day = i;
        //     }
            
        // }
        // for (int i = day; i < arr.length; i++) {
        //     if (max<arr[i]) {
        //      max=arr[i];
        //     }
            
        // }
        // return max-min;

        int buying = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(buying<arr[i]){
                int profit = arr[i]-buying;
                max = Math.max(profit, max);
            }else{
                buying=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(buyandSellStock(arr));
    }
    
}
