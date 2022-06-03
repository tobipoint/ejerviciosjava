/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[][] matriz;
     Scanner leer = new Scanner(System.in);
     matriz = new int [10][10];   
     int [][] matriz2;
     matriz2 = new int [3][3];
     
        for (int i = 0; i < 10; i++) {
         for (int j = 0; j < 10; j++) {
           matriz[i][j] = (int) (Math.random()* 20);
         }
        }
        for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
          matriz2[i][j] = (int) (Math.random()* 20); 
          }
        }
     buscaMatrizEnMatriz( matriz,matriz2);
     }
    
      
     public static void buscaMatrizEnMatriz(int[][] matriz, int[][] matriz2){
   
        int siguiente = 2;
        int limite = matriz[0].length;
        while (siguiente < limite) {
            
            for (int[] matriz1 : matriz) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz1[j] + " ");
                }
                System.out.print(matriz1[siguiente] + "\n");
            }
            siguiente++;
        }  
             
    }
}



