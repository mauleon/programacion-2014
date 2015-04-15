package conversortemperatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConversorTemperatura {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe la temperatura en ºC: ");
        double t = Double.parseDouble(br.readLine());

        System.out.println("Elije a que unidad convertir");
        System.out.println("1. Farenheit");
        System.out.println("2. Kelvin");
        System.out.print("Opcion: ");
        int opcion = Integer.parseInt(br.readLine());
        
        System.out.println("La tempera equivalente es: "+convertirTemperatura(t, opcion));

    }

    static double convertirTemperatura( double temperatura, int escala ) {
        
        switch(escala) {
            case 1:
                return 1.8*temperatura+32;
            case 2:
                return temperatura+273;
            default:
                return -9999;
        }
        
        //return -9999;
    }

    
    static double convertirTemperatura2( double temperatura, int escala ) {
        
        double r = -9999;
        
        switch(escala) {
            case 1:
                r = 1.8*temperatura+32;
            case 2:
                r = temperatura+273;
            default:
        }
        
        return r;
    }
    
    
}
