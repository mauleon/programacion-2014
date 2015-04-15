package ejerciciopar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioPar {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un valor: ");
        int n = Integer.parseInt(br.readLine());

        if( n % 2 == 0 )
            System.out.println("PAR");
        else
            System.out.println("IMPAR");
        
    }

}
