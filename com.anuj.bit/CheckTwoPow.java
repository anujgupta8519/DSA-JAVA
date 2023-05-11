public class CheckTwoPow {
    public static boolean checktwopow(int n) {
        boolean res = true;
        if ((n&(n-1)) !=0 ) {
            res = false;
        }

        return res;
        
    }
    public static void main(String[] args) {
        System.out.println(checktwopow(3));
    }
}
