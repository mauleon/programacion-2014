package ejerciciotermostato;

/**
 *
 * @author widemos
 */
public class Calefactor {
    
    private boolean encendido=false;
    
    private Termostato termostato;
    
    
    
    public void encender() {
        encendido = true;
    }
    
    public void apagar() {
        encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }
    
    public Termostato getTermostato() {
        return termostato;
    }

    public void setTermostato(Termostato termostato) {
        this.termostato = termostato;
    }
    
}
