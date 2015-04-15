package ejerciciomeses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioMeses {

    public static void main(String[] args) throws IOException {

        String[] meses = { 
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "setiembre", "octubre", "noviembre", "diciembre"
        };
        

        String[] meses2 = new String[12];
        
        meses2[0] = "enero";
        meses2[1] = "febrero";
        //...
        meses2[11] = "diciembre";
     
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el mes a buscar: ");
        String m = br.readLine();
        
        
        // ------- V1 ---------

/*        boolean encontrado = false;
        
        for (int i = 0; i < 12; i++) {
            
            if( m.equals(meses[i]) ) {
                System.out.println("Encontrado");
                encontrado = true;
            }
        }

        if(encontrado == false)
            System.out.println("NO encontrado");

        if(!encontrado)
            System.out.println("NO encontrado");
        
        */
        
        //  ------ V2

        int i=0;
        while( i<12 && !m.equals(meses[i])  ) {
            i++;
        }
        
        if(i<12)
            System.out.println("Encontrado");
        else
            System.out.println("NO encontrado");
        
        
        
    }

}
