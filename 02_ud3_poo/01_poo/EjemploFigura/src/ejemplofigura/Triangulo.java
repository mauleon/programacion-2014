package ejemplofigura;

/**
 *
 * @author widemos
 */
public class Triangulo extends Figura {

    @Override
    public void dibujar() {
        super.dibujar(); //To change body of generated methods, choose Tools | Templates.
    
        System.out.println("Dibujando: TRIANGULO en color: "+color);
    }
    
    
    public void voltearH() {
        System.out.println("Volteando en HORIZONTAL");
    }
    
    public void voltearV() {
        System.out.println("Volteando en VERTICAL");
    }
}
