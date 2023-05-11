package Basic;
public class FloyedTriangle {
    public static void main(String[] args) {
        int pin =1;
        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pin+" ");
                pin++;
            }
            System.out.println();
            
        }
    }
}
