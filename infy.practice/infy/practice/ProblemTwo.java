import java.util.*;
public class ProblemTwo {

    public static void getTheLongestSubString(String s) {
        //if String size is null then no need to run the loop
        if (s.isEmpty()) {
            System.out.println("Please Provide Valid String");
        }else if (s.length() ==1) { //  if String Size is 1 then no need to run the loop
            System.out.println("The Max Length of the Substring is : "+ s.length());
            
        }else{
        int max = 0;
        //Because set contains a unique element
        Set<Character> charset = new HashSet<>();
        int i =0;// for left
        int j = 0;// for rigth
        while (i<s.length()&&j<s.length()) {
            if (!charset.contains(s.charAt(j))) {
                charset.add(s.charAt(j));
                j++;
                max =Math.max(max, j-i);
            }else{
                //removing the first char because it comes again
                charset.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println("The Max Length of the Substring is : "+max);

    }
    }
    public static void main(String[] args) {
        getTheLongestSubString("abcabcbb");
        
    }
    
}
