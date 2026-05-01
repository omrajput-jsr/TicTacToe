public class TicTacToe_6 {
    static char[][] board = new char [3][3];
    public static void main (String[] args ) {
        placeMove(0,0,'X');
        System.out.println(board[0][0]);
    }

    static void placeMove(int row, int column , char symbol){
        board[row][column] = symbol;
    }
}