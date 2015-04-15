package ejerciciosumacinco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSumaCinco {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un valor: ");
        int v1 = Integer.parseInt(br.readLine());
        System.out.print("Escribe otro valor: ");
        int v2 = Integer.parseInt(br.readLine());
        System.out.print("Y otro: ");
        int v3 = Integer.parseInt(br.readLine());
        System.out.print("Y otro más...: ");
        int v4 = Integer.parseInt(br.readLine());
        System.out.print("¿Pensabas que se había acabado?, ¡otro!: ");
        int v5 = Integer.parseInt(br.readLine());

        int suma = v1 + v2 + v3 + v4 + v5;

        System.out.println("Resultado: " + suma);

    }

}
