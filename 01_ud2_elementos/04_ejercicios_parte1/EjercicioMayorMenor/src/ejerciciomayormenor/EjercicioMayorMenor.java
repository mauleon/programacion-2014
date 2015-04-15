package ejerciciomayormenor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioMayorMenor {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un valor: ");
        int v1 = Integer.parseInt(br.readLine());
        System.out.print("Escribe otro valor: ");
        int v2 = Integer.parseInt(br.readLine());

        
        if( v1 == v2 )
            System.out.println("Son iguales");
        else 
            if( v1 > v2 )
                System.out.println("El primer valor es mayor.");
            else
                System.out.println("El segundo valor es mayor.");


        if( v1 == v2 )
            System.out.println("Son iguales");
        if( v1 > v2 )
            System.out.println("El primer valor es mayor.");
        if( v1 < v2 )
            System.out.println("El segundo valor es mayor.");
        
        
        
        
        
        if( v1 == v2 ) 
        {
            System.out.println("Son iguales");
        }
        else 
        {
            if( v1 > v2 ) 
            {
                System.out.println("El primer valor es mayor.");
            }
            else
            {
                System.out.println("El segundo valor es mayor.");
            }
        }

        
        
        
        
    }

}
