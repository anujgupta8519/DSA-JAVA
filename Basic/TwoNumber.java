package Basic;
import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        if(firstNumber>secondNumber){
            System.out.println(firstNumber+"  is  greater than "+secondNumber);
        }else if(firstNumber==secondNumber){
            System.out.println(firstNumber+ " and "+ secondNumber+" are equal");
        }else{
            System.out.println(secondNumber+"  is  greater than "+firstNumber);
        }
        sc.close();
    }
    
}
