/*
@author:Om Rajput
@version:1.0
*/
public class TicTacToe_10 {

    static char[][] board = {
        {'X', 'O', 'O'},
        {'O', 'X', 'X'},
        {'X', 'O', 'O'}
    };

    public static void main(String[] args) {
        System.out.println(isDraw());
    }

    static boolean isDraw() {
        if(isWin()){
            return false;
        }else{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    static boolean isWin(){
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return true;
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return true;
        }

        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;

        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true;

        return false;
    }
}
