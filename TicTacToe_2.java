/*
*@author:Om Rajput
*@version:1.0
*/
import java.util.Random;
public class TicTacToe_2 {
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    public static void main(String[] args){
        tossAndAssignSymbols();
        displayTossResult();
    }
    static void tossAndAssignSymbols(){
        Random r = new Random();
        int turn = r.nextInt(2);
        if(turn == 0){
            isHumanTurn = false;
            humanSymbol='O';
            computerSymbol='X';
        }else{
            isHumanTurn = true;
            humanSymbol='X';
            computerSymbol='O';
        }
    }
    static void displayTossResult(){
        System.out.println("------------------");
        if(isHumanTurn == false){
            System.out.println("Computer Starts First:");
            System.out.println("Symbols:");
            System.out.println("Player: " + humanSymbol);
            System.out.println("Computer: " + computerSymbol);
        }else{
           System.out.println("Player Starts First:");
            System.out.println("Symbols:");
            System.out.println("Player: " + humanSymbol);
            System.out.println("Computer: " + computerSymbol);
        }
        System.out.println("------------------");
    }
}