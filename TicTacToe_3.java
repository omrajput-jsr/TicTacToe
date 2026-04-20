/*
*@author:Om Rajput
*@version:1.0
*/
import java.util.Scanner;
public class TicTacToe_3 {
    public static void main(String[] args){
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }
    static int getUserSlot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter slot number(1-9): ");
        int a = sc.nextInt();
        return a;
    }
}