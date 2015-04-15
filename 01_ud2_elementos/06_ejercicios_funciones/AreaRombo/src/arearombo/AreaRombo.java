package arearombo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaRombo {

    
    static double areaRombo(double D, double d) {
        return d*D/2;
    }
    
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe la diagonal mayor: ");
        double D = Double.parseDouble(br.readLine());
        System.out.print("Escribe la diagonal menor: ");
        double d = Double.parseDouble(br.readLine());
        
//        System.out.println("El área del rombo es: "+areaRombo(D,d));

        double A = areaRombo(D,d);
        System.out.println("El área del rombo es: "+A);
    
    }

}
