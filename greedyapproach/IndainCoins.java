import java.util.ArrayList;

public class IndainCoins {
    //canonical coin sysytem
    public static void findCurrency(int value) {
        int v = value;
        ArrayList<Integer> result = new ArrayList<>();
        int currency[] = {1,2,5,10,20,50,100,500,2000};
        int i=currency.length-1;
          while (v!=0) {
            if (v>=currency[i]) {
                v = v - currency[i];
                result.add(currency[i]); 
            }else{
                i--;
            }
            
          }
        System.out.println(result);
        System.out.println("count of coins "+result.size());
        
    }
    public static void main(String[] args) {
        int value=580;
        findCurrency(value);
    }
    
}
