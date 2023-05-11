public class PrintSubarrays {
    public static void printsubArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+",");
                    
                }
                System.out.print("],");
                
            }
            System.out.println();
            
        }

        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printsubArrays(arr);
    }
    
}
