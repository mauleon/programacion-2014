package ejerciciofactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioFactorial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        do {
            System.out.print("Escribe un número: ");

            try {
                n = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("ERROR: Lo que has escrito no es un número entero");
                n = -1;
            }

            if (n <= 0) {
                System.out.println("ERROR: El número no es válido");
            }
        } while (n <= 0);

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);
    }

}
