/*
*@author:Om Rajput
*@version:1.0
*/
public class TicTacToe_5 {
    static char[][] board = {
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}
    };
    public static void main(String[] args){
        System.out.println(isValidMove(1,1));
    }
    static boolean isValidMove(int row ,int column){
        if (row<0 || row>2 || column<0 || row>2){
            throw new IllegalArgumentException("Entered Move is Not within Bounds");
        }
        if (board[row][column] == '-'){
            return true;
        }
        else{
            return false;
        }
    }
}