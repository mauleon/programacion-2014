package ejercicioaprobadosuspendido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioAprobadoSuspendido {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe la nota: ");
        int nota = Integer.parseInt(br.readLine());
       
        switch (nota) {

            case 0:
                System.out.println("Zoquete!");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Matrícula de honor");
                break;
            default:
                System.out.println("ERROR: El valor que has introducido no es válido.");
                break;
        }
    }

}
