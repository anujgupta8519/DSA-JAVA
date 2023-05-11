

public class CheckPrimeNumber {
    public static Boolean checkprime(int num) {
        int res = 1&num;
        if (res==0) {
            return true;
        } else {
            return false;
            
        }


        
        
    }
    public static void main(String[] args) {
        System.out.println(checkprime(10));
    }
    
}
