package tries;

public class Implemention {
    static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int inx = word.charAt(i)-'a';
            if (curr.children[inx]==null) {
                curr.children[inx]=new Node();
            }
           curr= curr.children[inx];
            
        }
        curr.eow=true;
        
    }
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int inx = key.charAt(i)-'a';
            if (curr.children[inx]==null) {
                return false;
            }
           curr= curr.children[inx];
            
        }
        return curr.eow==true;
        
    }
    public static boolean isPrefix(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int inx = key.charAt(i)-'a';
            if (curr.children[inx]==null) {
                return false;
            }
           curr= curr.children[inx];
            
        }
        return true;
    }
    public static boolean wordBreak(String key) {
        if (key.length()==0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0,i))&&search(key.substring(i))) {
                  return true;
            }
        }
        return false;
    }
    public static int countNodes(Node root) {
        if (root==null) {
            return 0;
        }
        int count =0;
        for (int i = 0; i < 26; i++) {
           if (root.children[i]!=null) {
            count+=countNodes(root.children[i]);
           }            
        }
        return count+1;
    }
    public static String ans="";
    public static void longestPrefix(Node root, StringBuilder sb) {
        if (root==null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i]!=null&&root.children[i].eow==true) {
                char ch = (char)(i+'a');
                sb.append(ch);
                if (sb.length()>ans.length()) {
                    ans=sb.toString();
                }
                longestPrefix(root.children[i], sb);
                sb.deleteCharAt(sb.length()-1);
            }
            
        }
        
    }
    public static void main(String[] args) {
        // String words[] = {"apple", "app", "mango", "man","women","ice"};
        // for (String word : words) {
        //     insert(word);
        // }
        // // System.out.println(search("null"));
        // // System.out.println(search("the"));
        // // String key ="ilikesung";
        // // System.out.println(wordBreak(key));
        // System.out.println(isPrefix("moon"));
        // String str = "ababa";
        // for (int i = 0; i < str.length(); i++) {
        //     insert(str.substring(i));
        // }
        // System.out.println(countNodes(root));
    String words[] = {"a", "ap", "app", "appl","apply","apple","banana"};
        for (String word : words) {
            insert(word);
        }
        longestPrefix(root, new StringBuilder(""));
        System.out.println(ans);
    }
    
}
class Node{
    Node children[] = new Node[26];
    boolean eow=false;
    Node(){
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}