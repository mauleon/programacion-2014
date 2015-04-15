package ejemplofigura;

/**
 *
 * @author widemos
 */
public class Figura {

    protected int color;
    
    public void dibujar() {
        System.out.println("Dibujando: FIGURA en color: "+color);
    }
    
    public void mover() {
        System.out.println("Moviendo: FIGURA");
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    
}
