package recursion;
public class SumOfNatural {
    public static int sumofnaturalnumber(int n) {
        if(n==1){
            return 1;
        }
        
        return n+sumofnaturalnumber(n-1);
        
    }
    public static void main(String[] args) {
        System.out.println(sumofnaturalnumber(10));
    }
}
