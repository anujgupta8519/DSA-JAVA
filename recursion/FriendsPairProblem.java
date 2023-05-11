package recursion;

public class FriendsPairProblem {
    public static int friendpairproblem(int n) {
        if (n==1||n==2) {
            return n;
        }
        int singel = friendpairproblem(n-1);
        int pair = (n-1)* friendpairproblem(n-2);
        return singel+pair;
        
    }
    public static void main(String[] args) {
        System.out.println(friendpairproblem(3));
    }
}
