package menutresopciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuTresOpciones {

    static int menu() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;

        do {
            System.out.println("MENU");
            System.out.println("----\n");
            System.out.println("1. Desayuno");
            System.out.println("2. Comida");
            System.out.println("3. Cena");
            System.out.print("Opcion: ");

            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (IOException ex1) {
                System.out.println("ERROR: No sabemos que ha pasado.");
            } catch (NumberFormatException ex2) {
                System.out.println("ERROR: El valor introducido no es un número.");
            }

            if (opcion != 1 && opcion != 2 && opcion != 3) {
                System.out.println("ERROR: El valor no es válido.");
            }

        } while (opcion != 1 && opcion != 2 && opcion != 3);

        return opcion;
    }

    public static void main(String[] args) {

        System.out.println("La opción que has elegido es: " + menu());

    }

}
