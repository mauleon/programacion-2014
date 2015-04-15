package ejemplolista;

/**
 *
 * @author widemos
 */
public class Lista {
    
    // Referencia al primer elemento
    private Nodo primero = null;

    public void insertar( String dato ) {
        if( primero == null)
        {
            // Lista vacía
            primero = new Nodo();
            primero.setDato(dato);
        } else {
            // La lista no está vacía
            
            // Apuntar aux a primero
            Nodo aux = primero;
            
            while( aux.getSiguiente() != null )
            {
                aux = aux.getSiguiente();
            }
        
            Nodo n = new Nodo();
            n.setDato(dato);
            aux.setSiguiente(n);
        }
    }
    
    public void mostrar() {
    
        Nodo aux = primero;
        
        while( aux != null ) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
        
    }
}
