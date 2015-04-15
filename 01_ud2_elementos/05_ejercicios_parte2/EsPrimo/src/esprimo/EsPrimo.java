package esprimo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EsPrimo {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un número: ");

        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());

            boolean divisible = false;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    divisible = true;
                }
            }

            if (divisible == true) {
                System.out.println("NO es primo");
            } else {
                System.out.println("Es primo");
            }

        } catch (IOException ex) {
            Logger.getLogger(EsPrimo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex2) {
            System.out.println("ERROR: Escribe un número");
        }

    }

}
