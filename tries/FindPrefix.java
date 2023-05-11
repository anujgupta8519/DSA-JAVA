package tries;

public class FindPrefix {
    static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int inx = word.charAt(i)-'a';
            if (curr.children[inx]==null) {
                curr.children[inx]=new Node();
            }else{
                curr.children[inx].freq++;
            }
           curr= curr.children[inx];
            
        }
        curr.eow=true;
        
    }
    public static void findprefix(Node root, String ans) {
        if (root==null) {
            return;
        }
        if (root.freq==1) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
              if (root.children[i]!=null) {
                findprefix(root.children[i], ans+(char)(i+'a'));
              }

        }
        
    }
    public static void main(String[] args) {
        String words[]={"zebra","dog","duck","dove"};
        for (String string : words) {
            insert(string);
        }
        root.freq=-1;
        findprefix(root, "");
        
    }
    
}
class Node{
    Node children[] = new Node[26];
    boolean eow=false;
    int freq;
    Node(){
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        freq=1;
    }

}
