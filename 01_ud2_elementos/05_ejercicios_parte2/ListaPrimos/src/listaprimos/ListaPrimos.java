package listaprimos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListaPrimos {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un número: ");
        int limite = Integer.parseInt(br.readLine());

        for (int n = 1; n < limite; n++) {

            boolean divisible = false;

            /*            
             for (int i = 2; i < n; i++) {
             if (n % i == 0) {
             divisible = true;
             }
             }

             if (divisible == false) {
             System.out.println(n);
             }
             */

/*
            int i = 2;
            while (i < n && n % i != 0) {
                i++;
            }

            if (i == n) {
                System.out.println(n);
            }
*/
            
            int i = 2;
            while (i < n/2 && n % i != 0) {
                i++;
            }

            if (i == n/2) {
                System.out.println(n);
            }
            
            
        }

    }

}
