/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

/**
 *
 * @author Praktikan
 */
import java.util.Scanner;
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner scn = new Scanner(System.in);
        System.out.print("input ANGKA : ");
        int n=scn.nextInt();
//erickstdy.blogspot.com      

    for (int i = 1; i < n; i += 2) {
      for (int j = 0; j < 4 - i / 2; j++)
        System.out.print("o");

      for (int j = 0; j < i; j++)
        System.out.print("*");
        System.out.print("o\n");
    }

    for (int i = n; i > 0; i -= 2) {
      for (int j = 0; j < 4 - i / 2; j++)
        System.out.print("o");

      for (int j = 0; j < i; j++)
        System.out.print("*");
        System.out.print("o\n");
    }
  }
}
