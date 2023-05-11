public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for(int i =0; i<arr.length; i++){
            if (arr[i]==key) {
                return i+1;
                
                
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int num[] = {99,22,66,100,80};
        int key = 9;
        int result = linearSearch(num, key);
        if (result==-1) {
            System.out.println("Number is not Found");
            
        }else{

        
        System.out.println("Number is at index "+result);
    }
}
    
}
