package conversorfarenheit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConversorFarenheit {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe la temperatura en ºC: ");
        double t = Double.parseDouble(br.readLine());

        System.out.println("La tempera equivalente en ºF es: "+convertirTemperatura(t));
    }

    
    static double convertirTemperatura( double temperatura ) {
        return 1.8*temperatura+32;
    }
    
}
