package recursion;

public class Factorial {
    public static int fac(int n) {
        if (n==0) {
            return 1;
        }
      int fac = n * fac(n-1);
      return fac;
        
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
        
    }
    
}
