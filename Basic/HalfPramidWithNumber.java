package Basic;
public class HalfPramidWithNumber {
    public static void main(String[] args) {
        //By Krishna Gupta
        // for (int i = 5; i >= 1; i--) {
        //     for (int j = 1; j <=i ; j++) {
        //         System.out.print(j);
                
        //     }
        //     System.out.println();
            
        // }
        //By Apna College
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5-i+1 ; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println();
            
        }
    }
}
