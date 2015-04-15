package ejercicioalarma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioAlarma {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Alarma alarma = new Alarma();

        // Guardar el teléfono de aviso en la alarma
        System.out.print("Escribe el teléfono de aviso: ");
        alarma.setTelefonoAviso(Integer.parseInt(br.readLine()));

        int opcion = 0;

        do {
            System.out.println("1. Activar alarma\n"
                    + "2. Desactivar alarma (necesario PIN)\n"
                    + "3. Consultar sensores\n"
                    + "4. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:  // Activar la alarma
                    alarma.activar();
                    break;
                case 2:  // Desactivar la alarma
                    System.out.print("Escribe el PIN: ");
                    alarma.desactivar(Integer.parseInt(br.readLine()));
                    break;
                case 3:  // Consultar sensores
                    alarma.consultarSensores();
                    break;
                default:
            }

        } while (opcion != 4);

    }

}
