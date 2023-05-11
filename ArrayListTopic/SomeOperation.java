package ArrayListTopic;
import java.util.*;

public class SomeOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        int a =list.get(0);
        System.out.println(a);
        list.remove(2);
        list.set(2, 10);
        System.out.println(list);
    }
    
}
