public class ProblemThirtyThree {
    //Normal Approach
    public static int countones(int n) {
        int count =0;
        for (int i = 1; i <= n; i++) {
            int k =i;
    while (k!=0) {
        int temp = k%10;
        k/=10;
        if (temp==1) {
            count++;
        }
    }

            
        }
  return count;
    }
    //Optimize Approach
    public static int countoneso(int n) {
        int countr = 0;
        for (int i = 1; i <= n; i++)
        {
            String str = String.valueOf(i);
            countr += str.split("1",-1) . length - 1;
        }
        return countr;
            

            
        
        
    }
    public static void main(String[] args) {
       // int n =13;
        System.out.println(countones(13));
        System.out.println(countoneso(11));
        System.out.println(countoneso(0));

        
    }
    
}
