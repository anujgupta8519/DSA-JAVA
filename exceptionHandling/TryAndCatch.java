package exceptionHandling;
public class TryAndCatch {
    class InsufficentBalance extends Exception {
        InsufficentBalance(String s){
            super(s);
        }
    }

     void widhrawBalance (int totalbalance, int widrawamount )  throws InsufficentBalance{
        
      
        if (totalbalance<widrawamount) {
          throw  new   InsufficentBalance("Widrawable amount is greater than total amout");
        }
    }
    public static void main(String[] args) {
        try {
            TryAndCatch c = new TryAndCatch();
            c.widhrawBalance(100, 150);
        } catch (InsufficentBalance e) {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException k){
            System.out.println(k.getMessage());
        }
        finally{
            System.out.println("Program is run successfully");
        }
    }
}

