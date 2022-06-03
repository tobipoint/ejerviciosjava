/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);   
     String frase;
     int contV = 0;
     int contF = 0;
     int contA = 0;
      do {
         System.out.println("ingrese la frase");
        frase = leer. nextLine();
         if (frase.equals("&&&")) {
            contA = contA + 1 ;
         }
         if (frase.length() == 5) {
            if (frase.substring(0,1).equals("x") && frase.substring(4,5).equals("o")){
               System.out.println(frase.substring(0,1));
               System.out.println(frase.substring(4,5));
              contV = 1 + contV;
                }
            } else
                contF = contF + 1;
        } while (!frase.equals("&&&"));
        System.out.println("hizo " +contV+ " frases correctas");
        System.out.println("hizo " + contF+ " frases incorrectas");
       
    }
    
}
