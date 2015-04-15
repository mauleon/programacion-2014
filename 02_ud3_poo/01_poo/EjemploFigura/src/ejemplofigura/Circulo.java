package ejemplofigura;

/**
 *
 * @author widemos
 */
public class Circulo extends Figura {
    
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando: CIRCULO con el color: "+super.getColor());
    }
}
