package ArrayListTopic;

import java.util.ArrayList;

public class MaxWaterCoint {
    //Brute Force Approach
    public static int getMaxWaterCointainer(ArrayList<Integer> al) {
        int max = 0;
        for (int i = 0; i < al.size()-1; i++) {
            int count =1;
            for (int j = i+1; j < al.size(); j++) {
                int temp = Math.min(al.get(i), al.get(j))*count;
                max = Math.max(max, temp);
                count++;
            }

            
        }
        return max;
    }
    //Optimize Solution
    public static int getMaxOfWater(ArrayList<Integer> al) {
        int max = 0;
        int st =0;
        int ed = al.size()-1;
        while (st<ed) {
            int hight = Math.min(al.get(st),al.get(ed));
            int width = ed-st;
            int area = hight*width;
            max = Math.max(max, area);
            if (al.get(st)<al.get(ed)) {
                st++;
            }else{
                ed--;
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);al.add(8);al.add(6);al.add(2);al.add(5);
        al.add(4);al.add(8);al.add(3);al.add(7);
        System.out.println(getMaxWaterCointainer(al));
        System.out.println(getMaxOfWater(al));
    }
    
}
