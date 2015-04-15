package ejerciciocronometro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SegundaVersion {

    public static void main(String[] args) throws IOException {

        System.out.println("[SegundaVersion]");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cronometro[] relojes = new Cronometro[10];

        
        int opcion = 0;

        do {
            System.out.println("1. Nuevo cronómetro");
            System.out.println("2. Consultar cronómetro");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1: 
                {
                    int i = 0;
                    while( i < 10 && relojes[i] != null )
                        i++;

                    if( i < 10 )
                        relojes[i] = new Cronometro();
                    else
                        System.out.println("ERROR: No queda espacio disponible...");
                    break;
                }
                case 2:
                    System.out.println("Los relojes activos son: ");
                    for (int i = 0; i < 10; i++) {
                        if( relojes[i] != null )
                            relojes[i].tiempoTranscurrido();                        
                    }
                    break;
            }

        } while (opcion != 3);
        
    }

}
