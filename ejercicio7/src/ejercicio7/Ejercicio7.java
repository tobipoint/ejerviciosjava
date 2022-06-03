/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        String variable = "eureka";
        do{
        System.out.println(" escriba un frase ");
         frase = leer.nextLine();
         if (frase.equals("eureka")){
             System.out.println("correcto");
             break;
         }else{
         System.out.println("incorrecto");
         }
        } while(!frase.equals(variable));
    }
}
    
         
         
         
         

         