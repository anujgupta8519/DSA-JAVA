

public class ProblemThirtyTwo {
    public static long reverseBit(long n) {
        long result =0;
        for(int i=0; i< 32; i++){
            long lsb = n & 1;
            long reverseLsb = lsb << (31-i);
            result = result | reverseLsb;
            n = n >> 1;
        }
        return  result;
    }
    public static void main(String[] args) {
        //first case
        long n = 43261596;
        System.out.println(reverseBit(n));
        //second case
        long n1 = 4294967293;
        System.out.println(reverseBit(n1));
        System.out.println(Long.MAX_VALUE);


    }
}
