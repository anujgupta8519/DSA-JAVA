package recursion;

public class PowerN {
    public static int pow(int n, int p) {
        if (p==0) {
            return 1;
        }
        int pow = n * pow(n, p-1);
        return pow;
        
    }
    public static int power(int n, int p) {
        if (p==0) {
            return 1;
        }
        if (p%2==0) {
           return power(n, p/2)*power(n, p/2);
        } else {
            return n*power(n, p/2)*power(n, p/2);
            
        }
    /*if(p==0){
        return 1;
        int temp = power(n, p/2)*power(n, p/2);
        if(p%2!0){
            temp= temp *n;
        }
        return temp;
    } */
    }
    public static void main(String[] args) {
        
            System.out.println(pow(2, 10));
            System.out.println(power(2, 10));
        }
    }

