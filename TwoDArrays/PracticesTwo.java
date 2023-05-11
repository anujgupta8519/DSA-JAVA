package TwoDArrays;

public class PracticesTwo {
    public static int get_sum_of_second_row(int[][] matrix) {
        int sum=0;
        int line=1;
        for (int i = 0; i < matrix[1].length; i++) {
            sum +=matrix[line][i];
        }
        return sum;
    
}
public static void main(String[] args) {
    int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
    System.out.println(get_sum_of_second_row(matrix));
    
}
    
}
