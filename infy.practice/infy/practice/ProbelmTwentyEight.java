import java.util.Arrays;

public class ProbelmTwentyEight {
    //Brute Force Approach 
    //This approach is works fine for majority element (> n/2) and non majority elemnet
    public static int majorityElement(int arr[]) {
        int count[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int max =0;
        
        for (int i = 1; i < count.length; i++) {
           if (count[max]<count[i]) {
              max = i;
           }
            
        }
        //in any case there is no majority element so un comment this line and your code will return corrent result 
        // if (count[max]> (arr.length/2)) {
        //     return max;
        // }
     // in this condition comment this line and return -1
     //return -1;
       return max;
    }
    
     public static void printValue(int i) {
        //Uncomment this line for non majority element
        // if (i==-1) {
        //     System.out.println("Majority element not found");
        // } else {
            System.out.println("Majority element was found and element is : "+ i);
        // }
     }
       // simple and fast solution only for majority element
        public static int majorityElement1(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }

    public static void main(String[] args) {
        //first test case
        int arr[] = {3,2,3};
        int i = majorityElement(arr);
         printValue(i);
         int k = majorityElement1(arr);
         printValue(k);
         //second  test case
         int arr1[] = {2,2,1,1,1,2,2};
         int l = majorityElement(arr1);
         printValue(l);
         int r = majorityElement(arr1);
         printValue(r);
    }
    
}
