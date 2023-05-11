package ArrayListTopic;

import java.util.ArrayList;

public class PrintReverse {
    private static void reverse(ArrayList<Integer> l) {
        int st=0;
        int end=l.size()-1;
        while (st<=end) {
            int temp = l.get(st);
            l.set(st, l.get(end));
            l.set(end, temp);
            st++;
            end--;
        }
      
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        for (int i = al.size()-1; i >=0; i--) {
            System.out.print(al.get(i)+" ");
        }
        System.out.println(al);
        reverse(al);
        System.out.println(al);
    }
    
}
