package dynamicProgramming;

/**
 * Catalon
 */
public class Catalon {
    public static int catalon(int n) {
        if (n==1||n==0) {
            return 1;
        }
        int ans =0;
        for (int i = 0; i < n; i++) {
            ans+=catalon(i)*catalon(n-1-i);
        }
       return ans; 
    }
        public static int catalonM(int n,int dp[]) {
        if (n==1||n==0) {
            return 1;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        int ans =0;
        for (int i = 0; i < n; i++) {
            if (dp[i]==-1) {
                dp[i]=catalonM(i, dp);
            }
            if (dp[n-1-i]==-1) {
                dp[n-1-i] =catalonM(n-1-i, dp);
            }
            ans+=dp[i]*dp[n-1-i];
            
        }
        dp[n]=ans;
       return dp[n]; 
    }

    public static void main(String[] args) {
        int n =4000;
       // System.out.println(catalon(n));
        int dp[] = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] =-1;
        }
        System.out.println(catalonM(n, dp));

    }
}