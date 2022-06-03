/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[][] matriz;
     int n = 3;
    Scanner leer = new Scanner(System.in);
     matriz = new int [n][n]; 
     
     llenarmatriz(matriz, n);
        
     System.out.println("matriz");
      for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
         System.out.print(matriz[i][j]);
        }
          System.out.println(" ");
      }
      
       suma(matriz,n); 
 }
    
    public static void llenarmatriz(int[][] matriz, int n){
        Scanner leer = new Scanner(System.in);
        System.out.println("introduzca valores ente 1 y 9");
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int num = leer .nextInt();
            if (num >= 1 && num <= 9) {
              matriz[i][j] = num;
            }else
                   System.out.println("numero incorrecto");
         }
        }
    }
    public static void suma(int [][] matriz,int n){
     int sumafilaA =0;
     int sumafilaB = 0 ;
     int sumafilaC = 0 ;
     int sumacolumnaA =0;
     int sumacolumnaB =0;
     int sumacolumnaC =0;
     
     for (int j = 0; j < n; j++) {
         sumafilaA = matriz[0][j] + sumafilaA;
         sumafilaB = matriz[1][j] + sumafilaB;
         sumafilaC = matriz[2][j] + sumafilaC;
        }
        for (int i = 0; i < n; i++) {
         sumacolumnaA = matriz[i][0] + sumacolumnaA ;   
         sumacolumnaB = matriz[i][1] + sumacolumnaB; 
         sumacolumnaC = matriz[i][2] + sumacolumnaC;
        }
        if (sumafilaA == sumafilaB && sumafilaB == sumafilaC){
            if (sumacolumnaA == sumacolumnaB && sumacolumnaB == sumacolumnaC) {
             System.out.println("el cuadrado es magcio"); 
        }
        }else 
             System.out.println("el cuadrado no es magico");
    }
    
}



    
