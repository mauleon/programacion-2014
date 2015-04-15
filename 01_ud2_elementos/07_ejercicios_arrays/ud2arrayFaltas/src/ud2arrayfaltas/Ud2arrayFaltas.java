package ud2arrayfaltas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ud2arrayFaltas {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] alumno = new String[31];

        alumno[0] = "0";
        alumno[1] = "1";
        alumno[2] = "2";
        alumno[3] = "3";
        alumno[4] = "4";
        alumno[5] = "5";
        alumno[6] = "6";
        alumno[7] = "7";
        alumno[8] = "8";
        alumno[9] = "9";
        alumno[10] = "10";
        alumno[11] = "11";
        alumno[12] = "12";
        alumno[13] = "13";
        alumno[14] = "14";
        alumno[15] = "15";
        alumno[16] = "16";
        alumno[17] = "17";
        alumno[18] = "18";
        alumno[19] = "19";
        alumno[20] = "20";
        alumno[21] = "21";
        alumno[22] = "22";
        alumno[23] = "23";
        alumno[24] = "24";
        alumno[25] = "25";
        alumno[26] = "26";
        alumno[27] = "27";
        alumno[28] = "28";
        alumno[29] = "29";
        alumno[30] = "30";

        int[] faltas = new int[31];
        String respuesta = "";
        for (int i = 0; i < 31; i++) {
            faltas[i] = 0;
        }
        do {
            System.out.println("Introduce un código de alumno (1-30): ");

            int codigo = Integer.parseInt(br.readLine());

            System.out.println("Introduce el número de faltas del alumno");

            int faltasalumno = Integer.parseInt(br.readLine());

            faltas[codigo] = faltasalumno;

            System.out.println("¿Quieres seguir apuntando faltas?(S/N)");
            respuesta = br.readLine().toUpperCase();

        } while (respuesta.equals("S"));
        System.out.println("Faltas de los alumnos: ");
        for (int i = 0; i < 31; i++) {

            if (faltas[i] != 0) {
                System.out.println("Alumno con código: " + alumno[i] + " | " + faltas[i] + " faltas");
            }

        }

    }

}
