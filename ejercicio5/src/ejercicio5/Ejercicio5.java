/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.println("escriba un numero");
        Scanner leer = new Scanner(System.in);
        num = leer .nextInt();
        int doble = num *2;
        int triple = num *3;
        double raiz = Math.sqrt(num);
        System.out.println("el doble de " +num+ " es igual a: "+doble);
        System.out.println("el triple de " + num+ " es igual a 9" +triple);
        System.out.println("la raiz cuadrada de " + num + " es de: " +raiz);
        
    }
    
}
