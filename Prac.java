import java.util.ArrayList;

public class Prac {
    public static void main(String[] args) {
        // ArrayList<String> al = new ArrayList<>();
        // // al.add("Rohit");
        // // al.add("Shikhar");
        // // al.add("Virat");
        // // al.add("Dhoni");
        // // al.remove(1);
        // // System.out.println(al.contains("Virat"));
        // // al.set(2, "Rahul");
        // al.add("Aman");
        // al.add("Shubendu");
        // al.add("Shivaraj");
        // System.out.println(al.contains("Ankush"));
        // al.add("Ankush");
        // al.add("Vishal");
        // al.set(0, "Nrupul");
        // al.remove("Ankush");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(50);
        al.add(25);
        al.add(40);
        al.add(1, 200);
        System.out.println(al.contains(500));
        System.out.println(al.contains(100));
        al.remove(new Integer(40));
        al.add(27);
        System.out.println(al.contains(27));
        System.out.println(al);
    }
}
