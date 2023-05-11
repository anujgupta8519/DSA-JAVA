public class SortestPath {
    public static double getsortestpath(String str) {
        int x =0;
        int y=0;
        for (int i = 0; i < str.length(); i++) {
            char path = str.charAt(i);
            if (path=='N') {
                y++;
            } else if (path=='S') {
                y--;
            } else if (path=='E') {
                    x++;
            } else {
                x--;
            }
        }
        x = x*x;
        y= y*y;
        return Math.sqrt(x+y);
        
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getsortestpath(str));
    }
}
