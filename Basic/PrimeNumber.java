package Basic;
import java.util.Scanner;



public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean notPrime=false;
        for (int i = 2; i <= num-1; i++) {
            if(num%i==0){
                notPrime=true;
                break;
            }
            
        }
        if (notPrime) {
            System.out.println(num+" is not Prime Number");
            
        } else {
            System.out.println(num+ " is  Prime");
            
        }
        sc.close();
    }
    
}
