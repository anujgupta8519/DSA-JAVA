public class ClearLastBit {
    public static int clearlastbit(int n, int i) {
     return n&(-1<<i);        
    }
    public static void main(String[] args) {
        System.out.println(clearlastbit(15, 2));
        
    }
}
