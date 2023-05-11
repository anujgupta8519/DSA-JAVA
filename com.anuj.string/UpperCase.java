public class UpperCase {
    public static StringBuilder uppercase(StringBuilder sc) {
        //StringBuilder result = new StringBuilder();
        sc.setCharAt(0, Character.toUpperCase(sc.charAt(0)));
        for (int i = 1; i <sc.length(); i++) {
           
            if (sc.charAt(i)==' ' && i < sc.length()-1) {
                sc.setCharAt(i+1, Character.toUpperCase(sc.charAt(i+1)));
            }
            
        }
        return sc;
    }
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("i am KRISHNA gupta, am working with infosys as a software engineer");
        System.out.println(uppercase(sc));
    }
    
}
