package recursion;

public class Fabonachi {
    public static int nthfabonachi(int n ) {
        if (n==0 || n==1) {
            return n;
            
        }

        int num = nthfabonachi(n-1)+nthfabonachi(n-2);
        return num;
        
    }
    public static void main(String[] args) {
        System.out.println(nthfabonachi(4));
        
    }
}
