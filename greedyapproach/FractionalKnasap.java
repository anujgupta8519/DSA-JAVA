import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnasap {
    public static double fractionalKnasap(double[] weight, double value[], double tootalweight) {
        double totalamout =0;
        double arr[][] = new double[weight.length][4];
        for (int i = 0; i < weight.length; i++) {
            arr[i][0] =i;
            arr[i][1] =weight[i];
            arr[i][2] =value[i];
            arr[i][3] =(double)value[i]/weight[i];    
        }
        Arrays.sort(arr,Comparator.comparingDouble(o->o[3]));
        for (int i = arr.length-1; i >=0; i--) {
            if (tootalweight>arr[i][1]) {
                totalamout=totalamout+arr[i][2];
                tootalweight=tootalweight-arr[i][1];
            }else{
                totalamout = totalamout+(tootalweight*arr[i][3]);
                tootalweight=0;
                break;
            }
            
        }

        return totalamout;
        
    }

    public static void main(String[] args) {
        double weight[] = {10,20,30};
        double value[] = {60,100,120};
        double tootalweight =50;
        System.out.println(fractionalKnasap(weight, value, tootalweight));
    }
}