package ejerciciotemperaturas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTemperaturas {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int LONGITUD = 8760; // Constante
        
        double[] temperaturas = new double[LONGITUD];
        
        
        // Leer datos
        for (int i = 0; i < LONGITUD; i++) {
            System.out.print("Escribe una temperatura: ");
            double t = Double.parseDouble(br.readLine());
            
            temperaturas[i] = t;
        }

        
        // Calcular la máxima
        double max = -9999;

        for (int i = 0; i < LONGITUD; i++) {
            if( temperaturas[i] > max )
            {
                max = temperaturas[i];
            }
        }

                        
        // Calcular la mínima
        double min = temperaturas[0];

        for (int i = 1; i < LONGITUD; i++) {
            if( temperaturas[i] < min )
            {
                min = temperaturas[i];
            }
        }
        

        // Calcular la media
        double suma = 0;
        
        for (int i = 0; i < LONGITUD; i++) {
            suma += temperaturas[i];
        }
        
        double media = suma / LONGITUD;
        
        
        System.out.println("Máxima: "+max);
        System.out.println("Mínima: "+min);
        System.out.println("Media: "+media);
        
    }

}
