package ejerciciorobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioRobot {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Robot robbie = new Robot();

        String respuesta = null;
        do {
            System.out.print("X: ");
            int a = Integer.parseInt(br.readLine());
            System.out.print("Y: ");
            int b = Integer.parseInt(br.readLine());
            
            robbie.mover(a, b);
            
            System.out.print("¿Continuar? (s/n): ");
            respuesta = br.readLine();
        } while( respuesta.equalsIgnoreCase("s") );
        
    }

}
