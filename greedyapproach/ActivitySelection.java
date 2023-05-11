import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int maxAct =0;
        ArrayList<Integer> al = new ArrayList<>();
        // Start 
        maxAct = 1;
        al.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i]>=lastEnd) {
                maxAct++;
                al.add(i);
                lastEnd=end[i];
            }
            
        }
        System.out.println(maxAct);
        for (Integer integer : al) {
            System.out.print("A"+integer+" ");
            
        }
        System.out.println();

    }
    
}
