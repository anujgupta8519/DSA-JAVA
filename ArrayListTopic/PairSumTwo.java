package ArrayListTopic;

import java.util.ArrayList;

public class PairSumTwo {
    public static boolean isPairExits(ArrayList<Integer> al,int target ) {
 int ed =-1,n=al.size();
 for (int i = 0; i < al.size(); i++) {
    if (al.get(i)>al.get(i+1)) {
        ed=i;
        break;
    }
   
 }
 int st =ed+1;

        while (st!=ed) {
           if (al.get(st)+al.get(ed)==target) {
            return true;
           }else if (al.get(st)+al.get(ed)<target) {
            st=(st+1)%n;
           }else{
            ed=(n+ed-1)%n;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(10);
         System.out.println(isPairExits(al, 16));
    }
}
