/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int [] vector;
    System.out.println("ingrese el tamaño del vector");
    int n = leer .nextInt();
    vector = new int [n];
    for (int i = 0; i < vector.length ; i++) {
      vector[i] = (int) (Math.random() * 10);
    }
    System.out.println("introduzca numero a buscar");
    int num = leer .nextInt();
    int cont =0;
    for (int i = 0; i < vector.length ; i++) {
         if (num == vector[i]) {
           System.out.println(" cardinalidad " +i);
           cont = cont + 1;
         }
        }
    if (cont == 0) {
            System.out.println(" el numero no se encontro ");
    }
 }
}
