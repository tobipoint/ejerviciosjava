/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("introduzca tamaño del vector");
     int[][] vector;
     vector = new int [3][3];
        System.out.println("matriz: ");
     for (int i = 0; i < 3; i++) {
     for (int j = 0; j < 3; j++) {
       vector [i][j] = (int) (Math.random()*(5) *(-5) );
         System.out.print(vector[i][j]);
     }
         System.out.println(" ");
     } 
        System.out.println("matriz transpuesta: ");
     for (int i = 0; i < 3; i++) {
     for (int j = 0; j < 3; j++) {
        System.out.print(vector[j][i]); 
     }
         System.out.println(" ");   
    }
     for (int i = 0; i < 3; i++) {
     for (int j = 0; j < 3; j++) {
          if (vector[i][j] == -vector[j][i]) {
             System.out.println("la matriz es anti simetrica");
         }else 
             System.out.println("la matriz es simetica");
     }
     i = 3;
             
     }
}
}
