package TwoDArrays;

public class DigonalSum {
    public static int digonal_sum(int matrix[][]) {
        int sum =0;
        //brute force approch
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i==j||i+j==matrix.length-1) {
        //             sum = sum +matrix[i][j];
                    
        //         }

                
        //     }
            
        // }
        //optimise code
        for (int i = 0; i < matrix.length; i++) {
            sum +=matrix[i][i];

            if (i!=matrix.length-i-1) {
                sum+= matrix[i][matrix.length-i-1];
                
            }
            
            
        }
        return sum;
        
    }
    public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4}
        //                 ,{5,6,7,8}
        //                 ,{9,10,11,12},
        //                 {13,14,15,16}};
        int matrix[][] = {{0,1,2},
                           {3,4,5},
                            {6,7,8}};
        System.out.println("Digonal Sum is : "+digonal_sum(matrix));
    }
    
}
