package ejemplolista;

/**
 *
 * @author widemos
 */
public class Nodo {
    
    // Dato
    private String dato;
    
    // Referencia al siguiente Nodo
    private Nodo siguiente = null;

    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
