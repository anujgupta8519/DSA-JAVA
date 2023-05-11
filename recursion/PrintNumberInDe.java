package recursion;

public class PrintNumberInDe {
    public static void printnum(int num) {
        if(num==1){
            System.out.print(num+" ");
            return;

        }
        System.out.print(num+" ");
        printnum(num-1);
        
        
        
    }
    public static void printin(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        printin( n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        //printnum(10);
        printin(10);
    }
    
}
