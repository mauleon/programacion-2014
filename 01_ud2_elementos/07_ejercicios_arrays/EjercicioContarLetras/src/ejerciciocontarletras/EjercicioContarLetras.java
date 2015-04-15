package ejerciciocontarletras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioContarLetras {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un texto: ");
        String texto = br.readLine();

        final int LONGITUD = 5; // Constante
        
        char[] letras = new char[LONGITUD];
        letras[0] = 'a';
        letras[1] = 'b';
        letras[2] = 'c';
        letras[3] = 'd';
        letras[4] = 'e';

        //char[] letras2 = { 'a','b','c','d' };
        
        int[] recuento = new int[LONGITUD];
        for (int i = 0; i < LONGITUD; i++) {
            recuento[i] = 0;
        }
        
        
        
        // Recorrido
        for (int i = 0; i < texto.length(); i++) {
            
            char c = texto.charAt(i);
         
            // Búsqueda secuencial
            int j=0;
            while( j<LONGITUD && c != letras[j] ) {
                j++;
            }

            if(j<LONGITUD)
                recuento[j] = recuento[j] + 1;  // Encontrado!!
        }
        
        for (int i = 0; i < LONGITUD; i++) {
            System.out.println(letras[i]+": "+recuento[i]);
        }
    }

}
