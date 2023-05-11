package recursion;

public class LastOccerance {
    public static int lastoccerance(int arr[], int key, int i) {
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }else{
            return lastoccerance(arr, key, i-1);
        }
        
    }
    public static int lastoccer(int arr[], int key, int i) {
        if (i==arr.length) {
            return -1;
        }
        int k = lastoccer(arr, key, i+1);
        if (arr[i] ==key && k ==-1) {
            return i;
        }
        return k;
        
    }
    public static void main(String[] args) {
        int arr[] = {19,3,5,6,8,3,99,6,8,9,6,5,8};
        int key = 3;
        int i =0;
        //int i = arr.length-1;
        //System.out.println(lastoccerance(arr, key, i));
        System.out.println(lastoccer(arr, key, i));
    }
    
}
