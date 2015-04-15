package ejerciciohoradia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioHoraDia {

    public static void main(String[] args) throws IOException {

        int hora;
        int minutos;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe la hora: ");
        hora = Integer.parseInt(br.readLine());
        System.out.print("Escribe los minutos: ");
        minutos = Integer.parseInt(br.readLine());

        if (hora == 0 && minutos == 0) {
            // 0:00
            System.out.println("Medianoche");
        } else {
            if (hora == 12 && minutos == 0) {
                // 12:00
                System.out.println("Mediodía");
            } else {
                if (hora >= 0 && hora < 7) {
                    // Madrugada
                    System.out.println("Madrugada");
                } else {
                    if (hora >= 7 && hora < 12) {
                        // Mañana
                        System.out.println("Mañana");
                    } else {
                        if (hora >= 12 && hora < 20) {
                            // Tarde
                            System.out.println("Tarde");
                        } else {
                            if (hora >= 20 && hora < 24) {
                                // Noche
                                System.out.println("Noche");
                            } else {
                                System.out.println("ERROR");
                            }
                        }
                    }
                }
            }
        }

    }

}
