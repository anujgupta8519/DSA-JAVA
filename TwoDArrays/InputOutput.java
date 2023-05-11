package TwoDArrays;

import java.util.Scanner;

public class InputOutput {
    //Searching
    public static boolean fintKeyinMatrix(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if (matrix[i][j]==key) {
                    System.out.println("Fount at index ("+i+","+j+")" );
                    return true;
                    
                }
            }
            
        }
        return false;
        
    }
    //Find Max 
    public static int getMaxofArray(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, matrix[i][j]);
                
            }
            
        }
        return max;
        
    }

    //find min 
    public static int getMinofArray(int matrix[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
                
            }
            
        }
        return min;
        
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        //input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
            
        }
        //output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            
        }
        fintKeyinMatrix(matrix, 7);
        System.out.println(getMaxofArray(matrix));
        System.out.println(getMinofArray(matrix));
    }
    
}
