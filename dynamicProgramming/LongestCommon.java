package dynamicProgramming;

import java.util.Arrays;

public class LongestCommon {
    public static int lcs(String str1, String str2, int n, int m) {
        if (n<0||m<0) {
            return 0;
        }
        if (str1.charAt(n)==str2.charAt(m)) {
           return  lcs(str1, str2, n-1, m-1)+1;
        }else{
           int ans1 = lcs(str1, str2, n-1, m);
           int ans2 = lcs(str1, str2, n, m-1);
           return Math.max(ans1, ans2);
        }
        
    }
    public static int lcs1(String str1, String str2, int n, int m,int dp[][]) {
        if (n<0||m<0) {
            return 0;
        }
        if (dp[n][m]!=-1) {
            return dp[n][m]; 
        }
        if (str1.charAt(n)==str2.charAt(m)) {
           return dp[n][m]=  lcs1(str1, str2, n-1, m-1,dp)+1;
        }else{
           int ans1 = lcs1(str1, str2, n-1, m,dp);
           int ans2 = lcs1(str1, str2, n, m-1,dp);
           return dp[n][m]= Math.max(ans1, ans2);
        }
        
    }
    public static int lcs(String s, String t) {
		//Your code goes here
		int n = s.length();
		int m = t.length();
		int dp[][] = new int[n+1][m+1];
		for(int i=1;i<n+1;i++ ){
		    for(int j=1;j<m+1;j++){
				if (s.charAt(i-1)==t.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else{
					int ans1 = dp[i-1][j];
					int ans2 = dp[i][j-1];
					dp[i][j] = Math.max(ans1, ans2);
				}
			}
		}
		return dp[n][m];
    }
    public static void main(String[] args) {
        String str1= "abcde";
        String str2 = "ace";
         System.out.println(lcs(str1, str2, str1.length()-1, str2.length()-1));
        // System.out.println(lcs("abcdge", "abedg", 5, 4));
        int dp[][] = new int[str1.length()+1][str2.length()+1];
       for (int i = 0; i < dp.length; i++) {
        for (int j = 0; j < dp[0].length; j++) {
            dp[i][j]=-1;
        }
        
       }
        System.out.println(lcs1(str1, str2, str1.length()-1, str2.length()-1,dp));
        System.out.println(lcs(str1, str2));
        
    }
    
}
