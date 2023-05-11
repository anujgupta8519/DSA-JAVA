package Backtracking;

public class FindParmutation {
    public static void printper(String str, String ans) {
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            printper(newstr, ans+temp);
        }
        
    }
    public static void main(String[] args) {
        printper("abc", "");
    }
    
}
