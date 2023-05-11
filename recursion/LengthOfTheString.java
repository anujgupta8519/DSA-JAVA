package recursion;

public class LengthOfTheString {
    public static int lengthofthestring(String st, int i) {
        if (i==st.length()-1) {
            return 1;
            
        }
        int length = 1+lengthofthestring(st, i+1);
        return length;
    }
    public static int length(String st) {
        if (st.equals("")) {
            return 0;
        }
        return length(st.substring(1)) +1;
        
    }
    public static void main(String[] args) {
        System.out.println(lengthofthestring("abcdefghijklmnopqrstuvwxyz", 0));
        System.out.println(length("abcdefghijklmnopqrstuvwxyz"));
    }
}
