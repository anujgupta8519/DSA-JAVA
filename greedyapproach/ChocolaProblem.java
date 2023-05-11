import java.util.Arrays;
import java.util.Comparator;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n =4, m=6;
        Integer costhr[] = {2,1,3,1,4};
        Integer costvr[] = {4,1,2};
        Arrays.sort(costhr,Comparator.reverseOrder());
        Arrays.sort(costvr,Comparator.reverseOrder());
        int h =0,v=0;
        int hp=1,vp=1;
        int cost =0;
        while (h<costhr.length&&v<costvr.length) {
            if (costhr[h]>=costvr[v]) {
                cost+=(costhr[h]*vp);
                h++;
                hp++;
            }else{
                cost+=(costvr[v]*hp);
                v++;
                vp++;
            }
            
        }
        while (h<costhr.length) {
            cost+=(costhr[h]*vp);
            h++;
            hp++;
            
        }
        while (v<costvr.length) {
            cost+=(costvr[v]*hp);
            v++;
            vp++;
            
        }
        System.out.println(cost);
    }
}
