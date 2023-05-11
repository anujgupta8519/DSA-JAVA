public class AmazonProblem {
    private static String compression(String str) {
        StringBuilder re = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Integer count =1;
            while (  i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
               count++;
               i++; 
            }
              re.append(str.charAt(i));
            if (count>1) {
                re.append(count);
                
                

            
        }
    }
        return re.toString();
        
    }
    public static void main(String[] args) {
        String str = "aaaabbbbb";
        System.out.println(compression(str));
    }
    
}
