package Basic;
public class DecimalToBinary {
    public static void main(String[] args) {
        int dec = 12;
        int pow =0;
        int bin =0;
        while (dec>0) {
            int rem = dec%2;
            bin = bin +rem* (int)Math.pow(10, pow);
            dec/=2;
            pow++;
            
        }
        System.out.println(bin);
    }
}
