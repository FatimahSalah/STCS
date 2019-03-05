/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysudokugame;
import javax.swing.JFrame;

/**
 *
 * @author Fatimah
 */
public class MySudokuGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sudoku frm=new Sudoku();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(325,700);
        frm.setVisible(true);
    } //End main.  


} //End class SudokuGame.
