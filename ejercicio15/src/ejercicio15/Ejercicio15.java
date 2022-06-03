/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;


/**
 *
 * @author Usuario
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] vector;
      vector = new int[101];
        for (int i = 0 ; i < vector.length ; i++) {
          vector[i] = i;
        }
        for (int i = 100 ; i > 0 ; i--) {
            System.out.println(vector[i]);
        }
        }
    }    

