public class GoogleProblem {
    public static int countbit(int n) {
        int count =0;
        while (n>0) {
           if((1&n)!=0) {
            count++;
           }
         n = n>>1;

    
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countbit(10));
    }

}
