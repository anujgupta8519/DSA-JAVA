package dynamicProgramming;

import java.util.Arrays;

//recurrsion
public class ClimbingStairs {
    public static int countWays(int n) {
        if (n==0) {
            return 1;
        }
        if (n<0) {
            return 0;

        }
        return countWays(n-1)+countWays(n-2);
    }
    //dp
    public static int countWays(int n,int dp[]) {
        if (n==0) {
            return 1;
        }
        if (n<0) {
            return 0;

        }
        if (dp[n]!=-1) {
            return dp[n];
        }else{
            dp[n]= countWays(n-1,dp)+countWays(n-2,dp);
            return dp[n];
        }
        
    }
    public static int countWaysT(int n) {
     int dp[] = new int[n+1];
     dp[0]=1;
     for (int i = 1; i <=n; i++) {
        if(i==1){
            dp[i] = dp[i-1];

        }else{
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        
     }
     return dp[n];   
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(countWays(n));
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(countWays(n, dp));
    }
}
