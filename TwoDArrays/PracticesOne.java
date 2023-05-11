package TwoDArrays;
public class PracticesOne {
    public static int get_all_seven(int matrix[][]){
        int count =0;
        for (int index = 0; index < matrix.length; index++) {
            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[index][i]==7) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},
                        {8,8,7}};
        System.out.println(get_all_seven(matrix));
    }
}
