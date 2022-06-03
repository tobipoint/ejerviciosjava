/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("escriba dos numeros enteros positivos");
     int num = leer.nextInt();
     int num2 = leer.nextInt();
     int op;
     String confirmar;
     boolean op2 = false;
    do{
        
        System.out.println("MENU");
        System.out.println("1. suma");   
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("5.salir ");
        System.out.println("elija opcion");
        op = leer.nextInt();
        
      switch(op){
          case 1: 
              int suma = num + num2;
              System.out.println(suma);
              break;
          case 2:
              int resta = num - num2;
              System.out.println(resta);
              break;
          case 3:
              int multi = num * num2;
              System.out.println(multi);
              break;
          case 4:
              int divi = num / num2;
              System.out.println(divi);
              break;
          case 5:
              System.out.println("¿seguro que desea salir?(s/n)");
              confirmar = leer.next();
              if(confirmar.equals("s")) {
                 op2 = true;
             }
      } 
      } while (!op2);
    System.out.println("hasta pronto");
}
}
