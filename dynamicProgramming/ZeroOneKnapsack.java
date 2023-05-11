package dynamicProgramming;

public class ZeroOneKnapsack {
    public static int knapsack(int val[],int wt[],int W,int n) {
        if (W==0||n==0) {
            return 0;
        }
        if (wt[n-1]<=W) {
            int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1);
            int ans2= knapsack(val, wt, W, n-1);
            return Math.max(ans1,ans2);
        }else{
            return knapsack(val, wt, W, n-1);
        }
    }
    public static int knapsack1(int val[],int wt[],int W,int n ,int dp[][]) {
        if (W==0||n==0) {
            return 0;
        }
        if (dp[n][W]!=-1) {
            return dp[n][W] ;
        }

        if (wt[n-1]<=W) {
            int ans1 = val[n-1]+knapsack1(val, wt, W-wt[n-1], n-1,dp);
            int ans2= knapsack1(val, wt, W, n-1,dp);
         dp[n][W] = Math.max(ans1,ans2);
            return dp[n][W] ;
        }else{
            dp[n][W] =knapsack1(val, wt, W, n-1,dp);
            return dp[n][W] ;
        }
    }
    public static int name(int value[],int weight[],int maxWeight) {

      int n = value.length;
        int dp[][] = new int[n+1][maxWeight+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
     for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<maxWeight+1;j++){
                int v = value[i-1];
                int w=weight[i-1];
                if(w<=j){
                    int in = v+dp[i-1][j-w]; 
                    int ex = dp[i-1][j]; 
                    dp[i][j] = Math.max(in, ex);
                }else{
                    dp[i][j] = dp[i-1][j]; 
                }
            }
        }
        return dp[n][maxWeight];
        
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W=7;
        int dp[][] = new int[val.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(val, wt, W, val.length));
        System.out.println(knapsack1(val, wt, W, val.length, dp));
        System.out.println(name(val, wt, W));
    }
}
