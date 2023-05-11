package recursion;

public class ProblemTwo {
   static String st[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void changetostring(int n) {
        if (n==0) {
            return;
        }
 
        changetostring(n/10);
        int temp = n%10;
        System.out.print(st[temp]+" ");

    }
    public static void main(String[] args) {
        changetostring(2019);
    }
}
