package ejerciciotermostato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author widemos
 */
public class Termostato {
    
    private double temperaturaObjetivo;
    
    private Termometro termometro;
    private Calefactor calefactor;
    
    
            
    public void init() {
        setTermometro(new Termometro()); // 1
        getTermometro().setTermostato(this); // 3
        
        setCalefactor(new Calefactor()); // 2
        getCalefactor().setTermostato(this); // 4
        
        
        System.out.print("Introduzca la temperatura objetivo: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            temperaturaObjetivo = Double.parseDouble(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Termostato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run() {
        double temperaturaActual = termometro.getTemperatura();
        
        if( temperaturaActual < temperaturaObjetivo ) {
            System.out.println("INFO: Calentando...");
            calefactor.encender();

            while( temperaturaActual < temperaturaObjetivo ) {
                System.out.println("Temperatura: "+temperaturaActual);
                temperaturaActual++;
            }
            System.out.println("Temperatura: "+temperaturaActual);
            
            calefactor.apagar();
        } else
            System.out.println("INFO: No hace falta hacer nada...");
    }

    
    public Termometro getTermometro() {
        return termometro;
    }

    public void setTermometro(Termometro termometro) {
        this.termometro = termometro;
    }

    public Calefactor getCalefactor() {
        return calefactor;
    }

    public void setCalefactor(Calefactor calefactor) {
        this.calefactor = calefactor;
    }
    
    
}
