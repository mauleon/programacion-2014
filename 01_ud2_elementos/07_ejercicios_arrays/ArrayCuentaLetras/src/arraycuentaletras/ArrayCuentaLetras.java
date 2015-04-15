package arraycuentaletras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Realizar un programa que cuente el número de veces que aparece cada una de las 
 letras de un texto introducido por el teclado y a continuación imprima el 
 resultado (Frecuencia con la que aparecen las letras en un texto). Para hacer el
 ejemplo más sencillo, vamos a suponer que el texto solo contiene letras ç
 minúsculas del alfabeto ingles (no hay ni letrasacentuadas, ni 'll', ni 'ñ')
 */
public class ArrayCuentaLetras {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mete una frase");
        String frase = br.readLine();
        char aux = ' ';
        int resultado = 0;
        char[] letras = frase.toCharArray();
//        char[] letras2 = frase.toCharArray();
        int longitud = letras.length;
        boolean existe;
        for (int i = 0; i < longitud; i++) {
            aux = letras[i];
            resultado = 0;
            existe = false;
            for (int j = 0; j < i; j++) {
                if (aux == letras[j]) {
                    existe = true;
                }

            }
            if (!existe) {
                for (int k = 0; k < longitud; k++) {

                    if (aux == letras[k]) {
                        resultado++;

                    }
                }
                if (resultado > 0) {
                    System.out.println(aux + " esta " + resultado + " veces ");
                }

            }
        }
    }
}
