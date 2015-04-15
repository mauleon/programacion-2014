/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array2mtrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author lenovo
 */
public class Array2Mtrices {

    static int suma(int a, int b){
        int vuelta=999;
        
        vuelta = a+b;
       
        return vuelta;
    }
    
     static int escalar(int a){
         int escalar=999;   
         
         escalar=2*a;
            
            return escalar;
        }
        
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 Random r = new Random();
        int matriz[][]=new int [10][10];
                int matriz2[][]=new int [10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j]=r.nextInt(10);
                matriz2[i][j]=r.nextInt(10);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]+matriz2[i][j]+"  ");
                
            }System.out.println("\n");
        }
        int resultado;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                 resultado=suma(matriz[i][j],matriz2[i][j]);
                
                if (resultado==999){
                    System.out.println("error!!!");
                }else{
                    System.out.print(resultado+"  ");
                }
            }System.out.println("");
        }

        
        System.out.println("\nescalar\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                 resultado=escalar(matriz[i][j]);
                
                if (resultado==999){
                    System.out.println("error!!!");
                }else{
                    System.out.print(resultado+"  ");
                }
            }System.out.println("");
        }

}

}
