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