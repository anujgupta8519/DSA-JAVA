import java.util.*;
public class ProblemFourtyOne {
    public static List<String> removeInvalidParentheses(String s) {
        List<String> ret = new ArrayList<>();
        if (s == null) Arrays.asList("");
        List<String> candidates = new LinkedList<>();
        Set<String> tried = new HashSet<>();
        candidates.add(s);
        while (!candidates.isEmpty()) {
            for (String p : candidates) {
                if (isValid(p)) ret.add(p);
            }
            if (!ret.isEmpty()) return ret;
            List<String> nextLevel = new LinkedList<>();
            for (String p : candidates) {
                for (int i = 0; i < p.length(); ++i) {
                    if (p.charAt(i) != '(' && p.charAt(i) != ')') continue;
                    // bug - 2 => it's okay to have p.substring(0, 0) and p.substring(p.length());
                    String t = p.substring(0, i) + p.substring(i + 1);
                    if (tried.contains(t)) continue;
                    nextLevel.add(t);
                    tried.add(t);
                }
            }
            candidates = nextLevel;
        }
        return ret;
    }

    private static boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            if (c == ')' && count-- == 0) return false;
        }
        // bug - 2 => have to ensure each open parenthesis is closed properly;
        return count == 0;
    }
    public static void main(String[] args) {
        String str = "()())()";
        System.out.println(removeInvalidParentheses(str));
        String str1 = "(a)())()";
        System.out.println(removeInvalidParentheses(str1));
        String str3 = ")(";
        System.out.println(removeInvalidParentheses(str3));
    }
    
}
