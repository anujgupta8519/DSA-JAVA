package Basic;
import java.util.* ; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int one[] = new int[3];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int turn =1; turn<=t; turn++){
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            arr[i] =  sc.nextInt();
        }
            for(int i =0;i <n;i++){
                one[arr[i]]++;
            }
            int k =0;
            for(int j=0; j<one.length&& k< n;j++){
               while(one[j]!=0){
                   arr[k] = j;
                   k++;
               } 
            }
            for(int l =0; l<n; l++){
                System.out.print(arr[l]+" ");
            }
            System.out.println();
            sc.close();
        
    }}
}