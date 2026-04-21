/*
*@author:Om Rajput
*@version:1.0
*/
public class TicTacToe_4 {
    public static void main(String[] args){
        int slot = 7;
        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColumnFromSlot(slot));
    }
    static int getRowFromSlot(int slot){
        if (slot < 1 && slot > 9){
            throw new IllegalArgumentException("Slot must be between 1 and 9");
        }
            return (slot - 1) / 3;
    }
    static int getColumnFromSlot(int slot){
        if (slot < 1 && slot > 9){
            throw new IllegalArgumentException("Slot must be between 1 and 9");
        }
            return (slot - 1) % 3;
    }
}