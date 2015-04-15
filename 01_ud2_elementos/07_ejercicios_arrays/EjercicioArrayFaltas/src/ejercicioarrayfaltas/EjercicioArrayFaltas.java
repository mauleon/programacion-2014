package ejercicioarrayfaltas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioArrayFaltas {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int MAX_FALTAS = 1000;

        int[] codigos = new int[MAX_FALTAS];
        int[] faltas = new int[MAX_FALTAS];

        // Pedir datos
        int i = 0;
        String respuesta = "";
        do {
            System.out.print("Escribe el código de alumno: ");
            codigos[i] = Integer.parseInt(br.readLine());

            System.out.print("Escribe el número de faltas: ");
            int f = Integer.parseInt(br.readLine());
            faltas[i] = f;

            i++;

            System.out.print("¿Quieres continuar? (s/n): ");
            respuesta = br.readLine();
        } while (respuesta.equalsIgnoreCase("s"));

        // Recuento
        for (int k = 0; k < i; k++) {

            if (codigos[k] != -1) {
                int codigoBuscado = codigos[k];
                int suma = 0;

                for (int j = k; j < i; j++) {
                    if (codigoBuscado == codigos[j]) {
                        suma += faltas[j];
                        codigos[j] = -1;
                    }
                }

                System.out.println(codigoBuscado + ": " + suma);
            }
        }

    }

}
