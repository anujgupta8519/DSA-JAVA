package dynamicProgramming;

public class FibonachiSeries {
    public static int nthFibonachi(int n,int dp[] ) {
        if (n==0||n==1) {
            return n;
        }
        if (dp[n]!=0) {
            return dp[n];
        }else{
            dp[n]=nthFibonachi(n-1, dp)+nthFibonachi(n-2, dp);
            return dp[n];
        }
    }
    public static void main(String[] args) {
        int n =4;
        int dp[] = new int[n+1];

        System.out.println(nthFibonachi(n, dp));
    }
}
