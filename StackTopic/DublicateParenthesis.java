import java.util.Stack;

public class DublicateParenthesis {
    public static boolean idDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch==')')) {
                s.push(ch);
            }else{
                int count =0;
                while (s.pop()!='(') {
                    
                    count++;
                }
                if (count<1) {
                    return true;
                }
                // else{
                //     s.pop();
                // }
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        String str ="((a+b))";
        String str1="(a-b)";
        System.out.println(idDuplicate(str));
        System.out.println(idDuplicate(str1));
    }
}
