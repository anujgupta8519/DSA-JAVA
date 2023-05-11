public class ProblemThirtyOne {
    public static void rotateTheArray(int arr[], int k) {
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[(i+k)%arr.length]=arr[i];
        }
        for(int i=0; i<ans.length; i++){
            arr[i]=ans[i];
        }


        
    }
    public static void main(String[] args) {
        //First Test case
        int arr[] ={1,2,3,4,5,6,7};
        rotateTheArray(arr, 3);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Second test case
        int arr1[] = {-1,-100,3,99};
        rotateTheArray(arr1, 2);
        for (int i : arr1) {
            System.out.print(i+" ");
        } 

    }
    
}
