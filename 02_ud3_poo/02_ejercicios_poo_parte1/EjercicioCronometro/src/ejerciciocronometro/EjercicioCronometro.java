package ejerciciocronometro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCronometro {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cronometro[] relojes = new Cronometro[10];

        int numRelojes = 0;

        int opcion = 0;

        do {
            System.out.println("1. Nuevo cronómetro");
            System.out.println("2. Consultar cronómetro");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    if (numRelojes < 10) {
                        relojes[numRelojes] = new Cronometro();
                        numRelojes += 1;
                    } else {
                        System.out.println("ERROR: No se pueden crear más relojes...");
                    }
                    break;
                case 2:
                    System.out.print("Escribe el número de reloj (nº relojes " + numRelojes + "): ");
                    int n = Integer.parseInt(br.readLine());
                    if (n >= 0 && n < numRelojes) {
                        relojes[n].tiempoTranscurrido();
                    } else {
                        System.out.println("ERROR: El reloj seleccionado no existe...");
                    }
                    break;
            }

        } while (opcion != 3);
    }

}
