package recursion;

public class ProblemThree {
    public static int substring(String st) {
        if (st.length() ==1) {
            return 1 ;
        }
        if (st.length()==2) {
            return 3;
        }

        int singel = substring(st.substring(1));
        int pair = substring(st.substring(2));
        return singel+pair;

    }
    public static void main(String[] args) {
        System.out.println(substring("abc"));
    }
}
