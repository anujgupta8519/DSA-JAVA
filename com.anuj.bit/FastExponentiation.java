public class FastExponentiation {
    public static int power(int a, int p){
        int ans = 1;
        while (p>0) {
           if ((p&1)!=0) {//Check LSB
            ans = ans *a;
           }
            a=a*a;
            p=p>>1;
        } 
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(3, 5));
    }
}
