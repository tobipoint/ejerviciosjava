/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("escriba un numero");
       Scanner leer = new Scanner (System.in);
       int num = leer .nextInt();
    if (num % 2 == 0){ 
          System.out.println("el numero es par"); 
    }else{
            System.out.println("el numero es impar");
      }
    }
      }  
    