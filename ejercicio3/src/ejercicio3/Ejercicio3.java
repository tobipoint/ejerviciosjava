/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("escriba una frase");
        Scanner leer = new Scanner(System.in);
        String frase;
        frase = leer.nextLine();
        System.out.println("su frase en mayuscula es: " + frase.toUpperCase());
        System.out.println("su frase en miniscula es: " + frase.toLowerCase());
        
     
    }

}
