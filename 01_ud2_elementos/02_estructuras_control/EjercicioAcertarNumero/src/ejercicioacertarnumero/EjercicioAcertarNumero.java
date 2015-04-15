/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioacertarnumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 1fprog09
 */
public class EjercicioAcertarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n= (int)(Math.random()*100);
        String respuesta="N";
        int numero;
        do{
            System.out.print("Mete un número: ");
           numero= Integer.parseInt(br.readLine());
            if(numero==n){
                System.out.println("Acertaste!");
            }
            else{
                if(numero<n){
                    System.out.println("Tiene que ser mayor.");
                }
                else{
                    System.out.println("Tiene que ser menor");
                }
                System.out.print("¿Quieres seguir jugando? (S/N): ");
                respuesta = br.readLine();
            }
            
        }while (respuesta.equalsIgnoreCase("S")  && numero !=n);
        
    }
    
}
