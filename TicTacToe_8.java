/*
@author:Om Rajput
@version:1.0
*/
public class TicTacToe_8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char[][] board = {
        {'X', 'O', 'O'},
        {'O', 'X', 'X'},
        {'O', 'O', 'X'}
    };

    public static void main(String[] args) {
        while (!gameOver) {
            printBoard();
            if(checkWin() || isDraw()){
                System.out.println("Game Over!");
                gameOver = true;
            }
            else{
                gameOver = true;
            }

        } 
    }

    static boolean isDraw() {
        if(checkWin()){
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

    static boolean checkWin() {
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

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " " + board[i][1] + " " + board[i][2]);
        }
        System.out.println();
    }
} 
