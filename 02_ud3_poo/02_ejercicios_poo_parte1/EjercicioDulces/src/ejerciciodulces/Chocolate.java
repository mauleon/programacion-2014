package ejerciciodulces;

/**
 *
 * @author widemos
 */
public class Chocolate extends Dulce {
 
    private boolean conLeche = false;
    private boolean blanco = false;

    
    
    public boolean isConLeche() {
        return conLeche;
    }

    public void setConLeche(boolean conLeche) {
        this.conLeche = conLeche;
    }

    public boolean isBlanco() {
        return blanco;
    }

    public void setBlanco(boolean blanco) {
        this.blanco = blanco;
    }
    
    
}
