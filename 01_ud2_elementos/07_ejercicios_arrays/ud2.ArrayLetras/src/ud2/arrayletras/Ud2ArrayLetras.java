package ud2.arrayletras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ud2ArrayLetras {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] letras = new char[26];
        letras[0] = 'a';
        letras[1] = 'b';
        letras[2] = 'c';
        letras[3] = 'd';
        letras[4] = 'e';
        letras[5] = 'f';
        letras[6] = 'g';
        letras[7] = 'h';
        letras[8] = 'i';
        letras[9] = 'j';
        letras[10] = 'k';
        letras[11] = 'l';
        letras[12] = 'm';
        letras[13] = 'n';
        letras[14] = 'o';
        letras[15] = 'p';
        letras[16] = 'q';
        letras[17] = 'r';
        letras[18] = 's';
        letras[19] = 't';
        letras[20] = 'u';
        letras[21] = 'v';
        letras[22] = 'w';
        letras[23] = 'x';
        letras[24] = 'y';
        letras[25] = 'z';

        int[] repeticiones = new int[26];
        for (int i = 0; i < 26; i++) {
            repeticiones[i] = 0;
        }

        System.out.println("Introduce un texto: ");

        String texto = br.readLine();

        char letra;

        for (int i = 0; i < texto.length(); i++) {

            letra = texto.charAt(i);

            for (int j = 0; j < 25; j++) {

                if (letra == letras[j]) {
                    repeticiones[j] += 1;
                    j=25;
                }

            }

        }

        int valor=0;
        
        
        for (int i = 0; i < 26; i++) {
            
            valor= repeticiones[i];
            if (repeticiones[i]>0) {
                 System.out.println(letras[i] + ": " + repeticiones[i]);
            }
           
        }

    }

}
