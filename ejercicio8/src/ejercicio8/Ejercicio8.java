/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("introduzca una frase");
        String frase = leer.nextLine();
        int largo = frase.length();
        if (largo == 8) {
            System.out.println("correcto");   
        }else 
            System.out.println("incorrecto, la frase no tiene 8 de longitud");
    }
    
}
