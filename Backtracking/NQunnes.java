package Backtracking;

public class NQunnes {
    static int count =0;
    public static boolean isSafe(char board[][] , int row, int col) {
        //up
        for (int i = row-1; i >=0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        //digonal right
        for (int i = row-1,j=col-1; i >=0&&j>=0; i--,j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for (int i = row-1,j=col+1; i >=0&&j<board.length; i--,j++) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //digonal left
       return true; 
    }
    public static void place(char board[][] , int row) {// make this boolean
        if (row==board.length) {
            print(board);
            count++;
            return;//rreturn true;
        }
        for (int i = 0; i < board.length; i++) {
          if (isSafe(board, row, i)) {
            board[row][i] = 'Q';
            place(board, row+1);
            //if(place(board, row+1)){
                //return true;}
            }
            board[row][i] = 'x';
          }
          //return false
        }
        
    
    public static void print(char board[][] ) {
        System.out.println("--------Chess Board-------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int n =4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
           
        }
        place(board, 0);
        System.out.println(count);
    }
}
