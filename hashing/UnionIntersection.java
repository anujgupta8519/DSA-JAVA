package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr1) {
            hs.add(i);
        }
        for (int i : arr2) {
            hs.add(i);
        }
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Union is "+hs.size());
        hs.clear();
        int count =0;
        for (int i : arr1) {
            hs.add(i);
        } 
        
        for (int i : arr2) {
           if (hs.contains(i)) {
                 count++;
                 System.out.println(i);
               hs.remove(i);
           }
          
        }
        System.out.println(count);
    }
}
