package hashing;

import java.util.HashMap;

public class TicketQues {
    public static String getStrat(HashMap<String,String> hm) {
        HashMap<String,String> re = new HashMap<>();
        for (String key : hm.keySet()) {
            re.put(hm.get(key), key);
        }
        for (String key : hm.keySet()) {
           if (!re.containsKey(key)) {
            return key;
           }
        }
        return null;
      
    }
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("Mumbai", "Delhi");
        hm.put("Delhi", "Goa");
        hm.put("Goa", "Chennai");
        hm.put("Chennai", "Bangaluru");
        String stsrt= getStrat(hm);
        System.out.print(stsrt);
        for (String key : hm.keySet()) {
            System.out.print("->"+hm.get(stsrt));
            stsrt=hm.get(stsrt);
        }
    }
}
