package recursion;

public class ProblenFourteen {
    public static void printstring( int n,int i,String s ) {
        if (n==0) {
            System.out.println(s);
            return;
        }
        printstring(n-1,0,s+"0");
        if (i==0) {
            printstring(n-1,1,s+"1");
        }

    }
    public static void main(String[] args) {
        String s ="";
        printstring(3,0,s);
    }
}
