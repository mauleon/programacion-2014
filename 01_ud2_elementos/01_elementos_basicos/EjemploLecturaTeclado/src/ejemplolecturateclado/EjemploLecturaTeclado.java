package ejemplolecturateclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploLecturaTeclado {

    public static void main(String[] args) throws IOException {

        System.out.print("Escribe tu nombre: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println("¡Hola " + s + "!");

        System.out.print("¿Cuantos años tienes?: ");

        int edad = Integer.parseInt(br.readLine());

        //edad = edad - 10;
        System.out.println("¡Yo también tengo " + edad + " años!");

    }

}
