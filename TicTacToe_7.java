/*
*@author:Om Rajput
*@version:1.0
*/

import java.util.Random;

public class TicTacToe_7 {

    static char[][] board = {
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}
    };
    static char computerSymbol = 'O';
    public static void main(String[] args){
        computerMove();
    }
    static void computerMove(){

        Random r = new Random();

        int slot;
        do {
            slot = r.nextInt(9) + 1;
        } while (slot < 1 || slot > 9);

        int row = (slot - 1) / 3;
        int column = (slot - 1) % 3;
        if (board[row][column] == '-'){
            board[row][column] = computerSymbol;
        }
        else{
            computerMove();
        }
        System.out.println(board[row][column]);
    }
}