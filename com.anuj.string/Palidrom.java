public class Palidrom {
    public static boolean is_palidrom (String str) {
        boolean ans = true;
        int start =0;
        int end = str.length()-1;
        while (start<=end) {
            if (str.charAt(start) != str.charAt(end)) {
                ans=false;
            }
            start++;
            end--;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "raca";
        System.out.println(is_palidrom(str));

    }
}
