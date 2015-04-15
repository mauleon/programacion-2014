package ejerciciosumarnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSumarNumeros {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("¿Quieres sumar números? (s/n): ");
        String respuesta = br.readLine();

        int total = 0;
        
        while( respuesta.equalsIgnoreCase("s") ) {
//        while( respuesta.toUpperCase().equals("S") ) {
//        while( respuesta.equals("s") || respuesta.equals("S") ) {
            
            System.out.print("Escribe un número: ");
            int N = Integer.parseInt(br.readLine());

            total = total + N;
//            total += N;
            
            System.out.print("¿Quieres seguir sumando números? (s/n): ");
            respuesta = br.readLine();
        }
        
        System.out.println("La suma es: "+total);
    }

}
