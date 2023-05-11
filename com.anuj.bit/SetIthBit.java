public class SetIthBit {
    public static void setithbit(int n, int i) {
        int bitmsk = 1<<i;
        n = n|bitmsk;
        System.out.println(n);
    }
    
        
    private static int clearithbit(int n, int i) {
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
       // setithbit(10, 2);
       System.out.println(clearithbit(10, 1));
    }
}
