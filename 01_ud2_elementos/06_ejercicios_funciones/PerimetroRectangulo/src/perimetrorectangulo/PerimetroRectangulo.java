package perimetrorectangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerimetroRectangulo {

    static double perimetroRectangulo( double L, double l ) {
        
        double perimetro = 2*(L+l);
        
        return perimetro;
    }

    static double perimetroRectanguloV2( double L, double l ) {
        
        return 2*(L+l);
    }
    
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el lado mayor: ");
        double L = Double.parseDouble(br.readLine());
        
        System.out.print("Escribe el lado menor: ");
        double l = Double.parseDouble(br.readLine());
        
        double R = perimetroRectangulo(L,l);
        System.out.println("El perímetro del rectángulo es: "+R);

        System.out.println("El perímetro del rectángulo tambien es: "+perimetroRectanguloV2(L,l));
    
    }

}
