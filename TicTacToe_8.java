/*
@author:Om Rajput
@version:1.0
*/
import java.util.Scanner;
import java.util.Random;;
public class TicTacToe_8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char humanSymbol = 'X';
    static char computerSymbol = 'O';

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Turn:");
                humanMove();
            } else {
                System.out.println("Computer Turn:");
                computerMove();
            }

            printBoard();

            if (checkWin() || checkDraw()) {
                gameOver = true;
                System.out.println("Game Over!");
            } else {
                gameOver = false;
            }
        }
    }


    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " " + board[i][1] + " " + board[i][2]);
        }
        System.out.println();
    }

    static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
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



    static void humanMove(){
        while(isHumanTurn){
            System.out.println("Enter a slot between (1-9)");
            int slot = sc.nextInt();
            if(slot > 0|| slot <10) { 
                int row = (slot-1)/3;
                int column = (slot-1)%3;
                if(board[row][column] == '-' ){
                board[row][column] = humanSymbol;
                isHumanTurn=false;
                }else{
                System.out.println("Already Occupied");
                isHumanTurn=true;
                }
            }else{
                isHumanTurn=true;
            }
        }
    }
    static void computerMove(){
        while(!isHumanTurn){
            int move = rand.nextInt(9)+1;
            int row = (move-1)/3;
            int column = (move-1)%3;
            if(board[row][column] == '-' ){
                board[row][column] = computerSymbol;
                isHumanTurn=true;
            }else{
                System.out.println("Already Occupied");
                isHumanTurn=false;
            }
        }
    }
}