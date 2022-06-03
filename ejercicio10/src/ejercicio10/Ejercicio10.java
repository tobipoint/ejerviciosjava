/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     int maximo = 1000;
     int suma = 0;
     System.out.println("ingrese valores");
        for (int i = 0 ; suma <= maximo;) {
         int valores = leer .nextInt();
          suma = suma + valores;
        } while (suma <= maximo);
           System.out.println(suma);
        }
    }

 