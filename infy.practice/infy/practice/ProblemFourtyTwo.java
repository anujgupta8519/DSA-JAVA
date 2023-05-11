public class ProblemFourtyTwo {
    public static boolean isAdditiveNumber(String num) {
        if(num.length()==0) return true;
        for(int i=1; i<=num.length()/2; i++){
            if(i>18) break;
            if(num.charAt(0)=='0' && i>1) continue;
            String a = num.substring(0, i);
            for(int j=i+1; j<=num.length()-1; j++){
                if(j-i>18) break;
                if(num.charAt(i)=='0' && j-i>1) continue;
                String b = num.substring(i, j);
                for(int k=j+1; k<=num.length(); k++){
                    if(k-j>18) break;
                    if(num.charAt(j)=='0' && k-j>1) continue;
                    String c = num.substring(j, k);
                    if(Long.parseLong(a)+Long.parseLong(b)==Long.parseLong(c) && (k==num.length() || isAdditiveNumber(num.substring(i))))
                       return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
   
        System.out.println(isAdditiveNumber("112358"));
        System.out.println(isAdditiveNumber("199100199"));
    }
}
