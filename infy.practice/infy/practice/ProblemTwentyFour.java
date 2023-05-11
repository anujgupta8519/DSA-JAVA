public class ProblemTwentyFour {
    //First Method time Complexity = O(n) space Complexity= O(1)
public static int getMaxProfit(int prices[]) {
    int max = 0;
    int minPrice = prices[0];
    for (int i = 1; i < prices.length; i++) {
        minPrice = Math.min(minPrice, prices[i]);
        int currentProfit = prices[i] - minPrice;
        max = Math.max(max, currentProfit); 
    }
    return max;
    
}
 //Second Method time Complexity = O(n){time take by first method is O(n) and time take by second method is O(n-2) 
    //both method return O(2n) and if ignore constant and get time O(n) } space Complexity= O(1)
public static int getMaxOfProfitMethod(int prices[]) {
    int max =0;
    int minDay = 0;
    for (int i = 1; i < prices.length; i++) {
        if (prices[minDay]>prices[i]) {
            minDay = i;
        }
        
    }
    if (minDay==prices.length-1) {
        return max;
    }else{
        int maxDay = minDay+1;
        for (int i = minDay+2; i < prices.length; i++) {
            if (prices[maxDay]<prices[i]) {
                maxDay = i;
            }
            
        }
        max = prices[maxDay]- prices[minDay];
        return max;

    }

    
}
public static void main(String[] args) {
    //First Test case
    int prices[] = {7,1,5,3,6,4};
    System.out.println("First Method Return Max Profit is : "+getMaxProfit(prices));
    System.out.println("Second  Method Return Max Profit is : "+getMaxOfProfitMethod(prices));
    //Second test case
    int prices1[] = {7,6,4,3,1};
    System.out.println("First Method Return Max Profit is : "+getMaxProfit(prices1));
    System.out.println("Second  Method Return Max Profit is : "+getMaxOfProfitMethod(prices1));

    
}
}
