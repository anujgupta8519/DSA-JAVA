package Backtracking;

public class FindSubSet {
    public static void findSubSet(String str, StringBuilder ans, int i, int k) {

        if (i==str.length()) { 
            if (ans.length() == k) {
                System.out.println(ans);
            }
           
            return;
        }

        //yes 
        findSubSet(str, ans.append(str.charAt(i)), i+1, k);
        //no
       ans.deleteCharAt(ans.length()-1);
        findSubSet(str, ans, i+1, k);

        
    }
    public static void main(String[] args) {
        String str = "abcde";
        StringBuilder sb = new StringBuilder("");
        findSubSet(str,sb, 0,2);
    }
    
}
