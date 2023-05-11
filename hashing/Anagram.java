package hashing;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String s, String k) {
        if (s.length()!=k.length()) {
            return false;
        }else{
        HashMap<Character, Integer>  hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for (int i = 0; i < k.length(); i++) {
            char ch = k.charAt(i);
            if(hm.containsKey(ch)){
                if (hm.get(ch)==1) {
                    hm.remove(ch);
                }else{

                    hm.put(ch, hm.get(ch)-1);
                }

            }else{
                return false;
            }
        }
        return  hm.isEmpty();}
        }
    
    public static void main(String[] args) {
        String s = "race";
        String k = "care";
        System.out.println(isAnagram(s, k));
    }
}
