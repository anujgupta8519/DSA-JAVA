import java.util.Stack;

public class ProblemFourtyThree {
    public static String removeDuplicateLetters(String s) {

        int[] charFreq = new int[26];
        boolean[] included = new boolean[26];

        for (int idx = 0; idx < s.length(); idx++) {
            charFreq[s.charAt(idx) - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (int idx = 0; idx < s.length(); idx++) {
            char ch = s.charAt(idx);
            int charIdx = ch - 'a';
            charFreq[charIdx]--;

            if (included[charIdx]) {
                continue;
            }

            while (!stack.isEmpty() && ch < stack.peek() && charFreq[stack.peek() - 'a'] > 0) {
                included[stack.pop() - 'a'] = false;
            }

            included[ch - 'a'] = true;
            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    } 
    public static void main(String[] args) {
        String s="bcabc";
        System.out.println(removeDuplicateLetters(s));
        String s1 = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s1));
    }   
}
