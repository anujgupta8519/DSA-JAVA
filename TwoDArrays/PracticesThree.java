package TwoDArrays;

public class PracticesThree {
    public static void transposeMatrix(int matrix[][]) {
        int trans[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        for (int[] is : trans) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
            
        }
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};
        transposeMatrix(matrix);

    }
}
