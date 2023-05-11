import java.util.ArrayList;
import java.util.List;

public class ProblemTwentyThree {
    //helper function
    public static int getMinofArray(List<Integer> ls1, int ei) {
        if (ei==0) {
            return ls1.get(ei);
        }
        return Math.min(ls1.get(ei), getMinofArray(ls1, ei-1));
        
    }
    //Function
    public static int minPath(List<List<Integer>> ls) {
        int sum=0;
        for (int i = 0; i < ls.size(); i++) {
           sum = sum + getMinofArray(ls.get(i),ls.get(i).size()-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        //1st Test Case
        List<Integer> ls = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>();
        ls.add(2);
        ls1.add(3);
        ls1.add(4);
        List<Integer> ls2 = new ArrayList<>();
        ls2.add(6);
        ls2.add(5);
        ls2.add(7);
        List<Integer> ls3 = new ArrayList<>();
        ls3.add(4);
        ls3.add(1);
        ls3.add(8);
        ls3.add(3);
        List<List<Integer>> ls4 = new ArrayList<>();
        ls4.add(ls);
        ls4.add(ls1);
        ls4.add(ls2);
        ls4.add(ls3);
        System.out.println(minPath(ls4));
        //second  test case
        List<Integer> ls5 = new ArrayList<>();
        ls5.add(-10);
        //System.out.println(ls5);
        List<List<Integer>> ls6 = new ArrayList<>();
        ls6.add(ls5);
  
        System.out.println(minPath(ls6));
        



        
    }

}
