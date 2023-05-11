public class TrappedRainWater {
    public static int trappedRainWater(int num[]) {
        int n = num.length;
        int maxofLeft[] = new int[num.length];
        maxofLeft[0] = num[0];
        //max of left
        for (int i = 1; i < n; i++) {
            maxofLeft[i] = Math.max(num[i], maxofLeft[i-1]);   
        }
        //max of right
        int maxofRight[] = new int[num.length];
        maxofRight[n-1] = num[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxofRight[i] = Math.max(num[i], maxofRight[i+1]);
            
        }
        int trappedWater =0;
        for (int i = 0; i < n; i++) {
            trappedWater+= Math.min(maxofLeft[i], maxofRight[i])-num[i];
            
        }
        return trappedWater;

        
    }
    public static void main(String[] args) {
        int num[] = {4,2,0,6,3,2,5} ;
        System.out.println(trappedRainWater(num));
    }
    
}
