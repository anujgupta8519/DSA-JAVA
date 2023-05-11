public class ProblemFourty {
    public static void moveZeroToEnd(int arr[]) {
     int i = 0;
     int j =1;
     while (i<arr.length&&j<arr.length) {
        if (arr[i]==0&&arr[j]!=0) {
            int temp = arr[j];
            arr[j]= arr[i];
            arr[i] = temp;
            
        }
        if (arr[i]!=0) {
            i++;
        }
        j++;
       
     }
        
    }
    public static void print(int arr[]) {
        System.out.println("-------Array value is--------");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
      ///First Text Case
        int arr[] = {0,1,0,3,12,2,9,0,8,0,1,8};
        moveZeroToEnd(arr);
        print(arr);
        //second test case
        int arr1[]={0};
        moveZeroToEnd(arr1);
        print(arr1);
        
    }
    
}
