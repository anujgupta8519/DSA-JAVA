import java.util.Stack;

public class CompareToAndSubstring {
    public static boolean comapreto(String str, String str1) {
        if (str.equals(str1)) {
            return true;
        }
        return false;
        
    }
    public static String substring(String str, int strat, int end) {
        String sub ="";
        for (int i = 0; i < end; i++) {
            sub+=str.charAt(i);
        }

        return sub;
    }
    public static void main(String[] args) {
        String str = "Krishna";
        System.out.println(substring(str, 0, 4));
    }
    
}
