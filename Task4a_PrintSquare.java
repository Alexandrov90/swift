/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4a_printsquare;

/**
 *
 * @author User
 */
public class Task4a_PrintSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        int x = 5;
        for (int i = 0; i < x; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        for (int row2 = 0; row2 < n - 2; row2++) {
            System.out.print("* ");
            for (int col = 0; col < x - 2; col++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        for (int i = 0; i < x; i++) {
            System.out.print("* ");
        }
        System.out.println();
    
}
