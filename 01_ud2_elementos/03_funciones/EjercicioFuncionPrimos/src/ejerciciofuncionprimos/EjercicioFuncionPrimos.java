package ejerciciofuncionprimos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioFuncionPrimos {

    static boolean esPrimo(int n) {

        int i = 2;
        while (i < n && n % i != 0) {
            i++;
        }

        if (i == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un número: ");
        int limite = Integer.parseInt(br.readLine());

        for (int n = 1; n < limite; n++) {
            if (esPrimo(n)) {
                System.out.println(n);
            }
        }

    }

}
