package ejerciciocambios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCambios {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el precio: ");
        int precio = Integer.parseInt(br.readLine());
        System.out.print("Escribe el cantidad: ");
        int cantidad = Integer.parseInt(br.readLine());

        if (cantidad >= precio) {
            // Puedo continuar

            int cambio = cantidad - precio;
            
            System.out.println("Monedas de 2 euros: "+(cambio/200));
            cambio = cambio % 200;
            System.out.println("Monedas de 1 euro: "+(cambio/100));
            cambio = cambio % 100;
            System.out.println("Monedas de 50 céntimos: "+(cambio/50));
            cambio = cambio % 50;
            System.out.println("Monedas de 20 céntimos: "+(cambio/20));
            cambio = cambio % 20;
            System.out.println("Monedas de 10 céntimos: "+(cambio/10));
            cambio = cambio % 10;
            System.out.println("Monedas de 5 céntimos: "+(cambio/5));
            cambio = cambio % 5;
            System.out.println("Monedas de 2 céntimos: "+(cambio/2));
            
        } else {
            System.out.println("ERROR: No tienes dinero suficiente");
        }

    }

}
