package Backtracking;


public class Grid {
    public static int findWays(int i, int j, int m ,int n) {
        if (i==m-1&&j==n-1) {
            return 1;

        }else if (i==m||j==n) {
            return 0;
        }
        int d1 = findWays(i+1, j, m, n);
        int d2 = findWays(i, j+1, m, n);
        return d1+d2;
    }
    public static int findWays1(int m, int n) {
        int temp = fac(m-1);
        int temp1 = fac(n-1);
        int temp2 = fac(m-1+n-1);
        return temp2/(temp*temp1);
        
    }
    
    public static void main(String[] args) {
        System.out.println(findWays(0, 0, 7, 7));
        System.out.println(findWays1(7, 7));
    }
    public static int fac(int n) {
        if (n==0) {
            return 1;
        }
      int fac = n * fac(n-1);
      return fac;
        
    }
    
}
