package ejemploconversiones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploConversiones {

    public static void main(String[] args) throws IOException {

        byte variableByte = 7;

        int variableInt = 4098;

        //variableInt = variableByte;  // Implícita
        variableByte = (byte) variableInt;  // Explícita

        System.out.println("vB: " + variableByte);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número: ");

        String s = br.readLine();

        int n = Integer.parseInt(s);  // Conversión con clase asociada

        System.out.println("Has escrito: " + n);

    }

}
