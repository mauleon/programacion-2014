package ejerciciotermostato;

import java.util.Random;

/**
 *
 * @author widemos
 */
public class Termometro {
    
    private double temperatura;

    private Termostato termostato;
    
    
    public double getTemperatura() {
        Random r = new Random();
        
        temperatura=r.nextDouble()*35-5;
        
        return temperatura;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public void setTermostato(Termostato termostato) {
        this.termostato = termostato;
    }
    
    
}
