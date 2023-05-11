package Basic;
public class HollowRombus {

        public static void main(String[] args) {
        int n =10;
        //apna college
        //Dry Run krna hai
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=n; j++) {
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
        //by krishna
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
                
        //     }
        //     if(i==1||i==n){
        //         for (int j = 1; j <=n; j++) {
        //             System.out.print("*");
                    
        //         }

                    
        //     }else{
        //         System.out.print("*");
        //         for (int j = 1; j < n-2; j++) {
        //             System.out.print(" ");
        //         }
        //         System.out.print("*");
        //     }

        //     System.out.println();
            
        // }
    }

}
