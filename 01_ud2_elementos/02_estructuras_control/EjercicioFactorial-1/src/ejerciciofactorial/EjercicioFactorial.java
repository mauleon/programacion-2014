/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 1fprog09
 */
public class EjercicioFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float m;

        do {
            System.out.print("Escribe un número entero y positivo: ");
            m = Float.parseFloat(br.readLine());

        } while (m <= 0 || m % 1 != 0);

        int n = (int) m;
        int factorial = 1;
        
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        System.out.println("FACTORIAL: " + factorial);
        
        /*int fact=1;
         for (int j = 1; j <= n; j++) {
         fact *= j;
            
         }
         System.out.println(fact);*/
    }


}
