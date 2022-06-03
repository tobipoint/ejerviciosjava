/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("iintroduzca los euros para convertilos");
     Scanner leer = new Scanner(System.in);
     int euros = leer .nextInt();
     cambios(euros);

     
    }
    public static void cambios(int a){
    float yenes = (float) (a * 129.8);
    float libras = (float) (a * 0.86);
    float dolar = (float) (a * 1.28);
    System.out.println("los euros ingresados corresponden a: " + yenes + " yenes " + dolar + " dolares " + libras + " libras ");
    }
}
