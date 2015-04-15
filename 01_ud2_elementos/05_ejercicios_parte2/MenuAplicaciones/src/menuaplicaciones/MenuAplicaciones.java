package menuaplicaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuAplicaciones {

    public static void main(String[] args) throws IOException {

        String opcion="";
        do {
            System.out.print("a. Procesador de Texto.\n"
                    + "b. Hoja de Calculo.\n"
                    + "c. Base de Datos.\n"
                    + "Introduzca una Opción: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            opcion = br.readLine();

            System.out.print("Has elegido ");
            switch (opcion) {
                case "a":
                case "A":
                    System.out.println("procesador de textos.");
                    break;
                case "b":
                case "B":
                    System.out.println("hoja de cálculo.");
                    break;
                case "c":
                case "C":
                    System.out.println("base de datos.");
                    break;
                default:
                    System.out.println("ERROR: Escribe a, b o c.");
            }

        } while (!(opcion.equalsIgnoreCase("a") || opcion.equalsIgnoreCase("b") || opcion.equalsIgnoreCase("c")));
    }

}
