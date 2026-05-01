/*
@author:Om Rajput
@version:1.0
*/
public class TicTacToe_9 {

    static char[][] board = {
        {'X', 'O', 'O'},
        {'-', 'X', '-'},
        {'-', '-', 'X'}
    };

    public static void main(String[] args) {
        System.out.println(hasWon('X'));
    }

    static boolean hasWon(char A) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == A && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return true;
            if (board[0][i] == A && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return true;
        }

        if (board[0][0] == A && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;

        if (board[0][2] == A && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true;

        return false;
    }
}