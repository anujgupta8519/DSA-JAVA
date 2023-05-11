import java.util.Stack;

public class ValidParenthesis{
    public static boolean validParenthesis(String s) {
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='('||c=='{'||c=='[') {
                ch.push(c);
            }else  {
                if (ch.isEmpty()) {
                    return false;
                }
            if ((c==')'&&ch.peek()=='(')||(c=='}'&&ch.peek()=='{')||(c==']'&&ch.peek()=='[')) {
                ch.pop();
            } else{
                return false;
            }  
            }  
        }
        //System.out.println(ch);
        if (ch.isEmpty()) {
            
            return true;
        }
        return false;
    }
    //
    public static void main(String[] args) {
        System.out.println(validParenthesis("{({[]"));
        
    }
}