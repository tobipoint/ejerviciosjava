/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("introduzca tamaño del vector");
     int n = leer.nextInt();
     int[] vector;
     vector = new int [n];
     for (int i = 0; i < n; i++) {
        vector [i] = (int) (Math.random()* 1000);
        }
        int cont = 0;
        int cont2 =0;
        int cont3 = 0;
        int cont4 = 0;
     for (int i = 0; i < n; i++) {
        if ((vector[i] >= 0) && (vector[i] <= 9)){
         cont = cont + 1;
        }
        if ((vector[i] >= 10) && (vector[i] <= 99)) {
         cont2 = cont2 +1;
        }
        if ((vector[i] >= 100) && (vector[i] <= 999)) {
         cont3 = cont3 +1;
        }
        if ((vector[i] >= 999)){ 
         cont4 = cont4 + 1;
        }
     }
        System.out.println(" hay " +cont+ " de 1 digito");
        System.out.println(" hay " +cont2+ " de 2 digito");
        System.out.println(" hay " +cont3+ " de 3 digito");
        System.out.println(" hay " +cont4+ " de 4 digito");
 }
}
    

