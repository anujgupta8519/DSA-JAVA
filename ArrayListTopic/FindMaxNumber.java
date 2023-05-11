package ArrayListTopic;

import java.util.ArrayList;

public class FindMaxNumber {
    public static int getMax(ArrayList<Integer> ls) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ls.size(); i++) {
            max = Math.max(max, ls.get(i));
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(9);
        al.add(5);
        System.out.println(getMax(al));
    }
    
}
