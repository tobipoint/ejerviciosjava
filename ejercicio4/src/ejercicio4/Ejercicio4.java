/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("introduzca grados centigrados");
        int gradosC = leer .nextInt();
        int gradosF = ((gradosC * 9/5) + 32);
        System.out.println("los grados convertidos son = " +gradosF+ "F");
    }
    
}
