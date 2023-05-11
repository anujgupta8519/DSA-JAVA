package recursion;
public class TileProblem {
    public static int tileproblrm(int n) {
        if(n==0||n==1){
            return 1;
        }
        int veritacal = tileproblrm(n-1);
        int horizontal = tileproblrm(n-2);
        return veritacal+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tileproblrm(5));
    }
}
