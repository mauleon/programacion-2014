package diasemana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DiaSemana {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número del 1 al 7: ");
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(DiaSemana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex2) {
            System.out.println("ERROR: Lo que has escrito no es un número.");
        }

        switch (n) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR: El número no es válido.");
        }

    }

}
