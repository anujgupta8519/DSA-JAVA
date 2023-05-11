package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]= {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(i)) {
              hm.put(i, hm.get(i)+1);                
            }else{
                hm.put(i, 1);
            }
        }
       Set<Integer> s = hm.keySet();
       for (Integer k : s) {
        if (hm.get(k)>(arr.length/3)) {
            System.out.println(k+"  -> "+hm.get(k));
        }
       }

       
    }
}
