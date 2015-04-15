package ejemplobombilla;

/**
 *
 * @author widemos
 */
public class Bombilla {
    
    // Propiedades
    private boolean estado = false;
        
    
    Bombilla( boolean estado ) {
        this.estado = estado;
    }
    
    
    // Métodos
    public void encender() {
        estado = true;
    }
    
    public void apagar() {
        estado = false;
    }

    public boolean isEstado() {
        return estado;
    }
    
}
