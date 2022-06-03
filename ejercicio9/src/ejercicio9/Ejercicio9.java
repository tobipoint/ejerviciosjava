/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("introduzca una frase");
      String frase = leer.nextLine();
      String letra = frase.substring(0,1);
        if (letra.equalsIgnoreCase("a")){
            System.out.println("correcto"); 
        }else
            System.out.println("la primera letra no es una A");
    }
}
