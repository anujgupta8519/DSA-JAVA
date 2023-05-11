package ArrayListTopic;

import java.util.ArrayList;

public class PairSum {
    public static boolean isPairExits(ArrayList<Integer> al,int target ) {
        int st =0;
        int ed = al.size()-1;

        while (st<ed) {
           if (al.get(st)+al.get(ed)==target) {
            return true;
           }else if (al.get(st)+al.get(ed)<target) {
            st++;
           }else{
            ed--;
           }
        }
        return false;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
       al.add(1);
       al.add(2);
       al.add(3);
       al.add(4);
       al.add(5);
       al.add(6);
        System.out.println(isPairExits(al, 50));
        
    }
}
