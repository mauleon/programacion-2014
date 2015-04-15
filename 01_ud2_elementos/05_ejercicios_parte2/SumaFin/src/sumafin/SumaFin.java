package sumafin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaFin {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta = "";
        int suma = 0;
        do {
            System.out.print("Escribe un número (FIN para terminar): ");
            respuesta = br.readLine();

            int n = 0;

/*          
            if (!respuesta.equals("FIN")) {
                n = Integer.parseInt(respuesta);
                suma += n;
            }
*/

            try {
                n = Integer.parseInt(respuesta);
                suma += n;                
            } catch (Exception e) {
                if(!respuesta.equalsIgnoreCase("FIN"))
                    System.out.println("ERROR: Escribe un número...");
            }
        
        } while (!respuesta.equalsIgnoreCase("FIN"));

        System.out.println("La suma es: "+suma);
    }

}
