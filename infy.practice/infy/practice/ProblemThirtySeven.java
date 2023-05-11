public class ProblemThirtySeven {
    public static long bitWiseAnd(long left, long right){
        int count=0;
        while(right!=left){
            right=right>>1;
            left = left>>1;
            count++;

        }
        return right<< count; 
    }
   public static void main(String[] agrs){
    //first test case
    System.out.println(bitWiseAnd(5, 7));
    //second test case
    System.out.println(bitWiseAnd(0, 0));
    //Third test case
    System.out.println(bitWiseAnd(1, 2147483647));

   }
    
}

